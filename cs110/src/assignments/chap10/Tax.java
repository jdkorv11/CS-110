package assignments.chap10;

public class Tax {
	// tax status options
	public static final int SINGLE_FILER = 0;
	public static final int MARRIED_JOINTLY_OR_QUALIFYING_WIDOWER = 1;
	public static final int MARRIED_SEPARAELY = 2;
	public static final int HEAD_OF_HOUSEHOLD = 3;

	private int filingStatus;
	// brackets stores the minimum amount taxed at each rate
	// minimum for first bracket is $1
	private int[][] brackets = new int[4][5];
	// all rates stored as a percentage
	private double[] rates = new double[5];
	private double taxableIncome;

	public Tax() {
		// no argument constructor
	}

	public Tax(int filingStatus, int[][] brackets, double[] rates,
			double taxableIncome) {
		this.filingStatus = filingStatus;
		this.brackets = brackets;
		this.rates = rates;
		this.taxableIncome = taxableIncome;
	}

	public double getTax() {
		double tax = 0;
		double bracketMax = taxableIncome;
		int bracketLevel = getBracketLevel(bracketMax, brackets[filingStatus]);
		for (int i = 5; i >= 0;) {
			double bracketTax = getBracketTax(bracketMax,
					brackets[filingStatus][bracketLevel], rates[bracketLevel]);
			tax += bracketTax;
			bracketMax = brackets[filingStatus][bracketLevel] - 1;
			bracketLevel--;
			i = bracketLevel;
		}
		return tax;
	}

	public void setTFilingStatus(int status) {
		if (status < 0 || status > 3)
			error("setTaxStatus");
		else
			filingStatus = status;
	}

	public void setTaxableIncome(double amt) {
		taxableIncome = amt;
	}

	public void setBrackets(int[][] bracket) {
		if (bracket.length != 4 || bracket[0].length != 5)
			error("setBrackets");
		else
			brackets = bracket;
	}

	public void setBracket(int filingStatus, int[] bracket) {
		if (bracket.length != 5)
			error("setBracket");
		else
			brackets[filingStatus] = bracket;
	}

	public void setRates(double[] rates) {
		if (rates.length == 5)
			this.rates = rates;
		else
			error("setRates");
	}

	public double getTaxableIncome() {
		return taxableIncome;
	}

	public int[][] getBrackets() {
		return brackets;
	}

	public int[] getBracket(int filingStatus) {
		if (filingStatus < 0 || filingStatus > 4) {
			error("getBracket");
			int[] a = { -1 };
			return a;
		} else
			return brackets[filingStatus];
	}

	public double[] getRates() {
		return rates;
	}

	public int getFilingStatus() {
		return filingStatus;
	}

	private void error(String method) {
		System.out.println("Invalid paramater on method " + method);
	}

	private int getBracketLevel(double amt, int[] bracket) {
		for (int i = bracket.length - 1; i >= 0; i--) {
			if (amt > bracket[i])
				return i;
		}
		return 0;
	}

	private double getBracketTax(double amt, int bracketAmt, double rate) {
		double levelTax = (amt - bracketAmt - 1) * (rate / 100);
		return levelTax;
	}
}
