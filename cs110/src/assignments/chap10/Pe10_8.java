package assignments.chap10;

public class Pe10_8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[][] bracket2001 = { { 0, 8351, 33951, 82251, 171551, 372951 },
				{ 0, 16701, 67901, 137051, 208851, 372951 },
				{ 0, 8351, 33951, 68526, 104426, 186476 },
				{ 0, 11951, 45501, 117451, 190201, 372951 } };
		int[][] bracket2009 = { { 0, 27051, 65551, 136751, 297351 },
				{ 0, 45201, 109251, 166501, 297351 },
				{ 0, 22601, 54626, 83251, 148676 },
				{ 0, 36251, 93651, 151651, 297351 } };
		double[] rates2001 = { 10, 15, 25, 28, 33, 35 };
		double[] rates2009 = { 15, 27.5, 30.5, 35.5, 39.1 };

		Tax tax2001 = new Tax(0, bracket2001, rates2001, 0);
		Tax tax2009 = new Tax(0, bracket2009, rates2009, 0);

		int[] taxableIncome = { 50000, 51000, 52000, 53000, 54000, 55000,
				56000, 57000, 58000, 59000, 60000 };
		int[] taxStatus = { Tax.SINGLE_FILER, Tax.MARRIED_SEPARAELY,
				Tax.MARRIED_JOINTLY_OR_QUALIFYING_WIDOWER,
				Tax.HEAD_OF_HOUSEHOLD };
		System.out.println("2001 taxes");
		for(int status: taxStatus) {
			String fileStatus;
			switch(status) {
			default:
				fileStatus = "Single";
				break;
			case 1:
				fileStatus = "Married filing jointly\nor qualifying widow(er)";
				break;
			case 2:
				fileStatus = "Married filing seperately";
				break;
			case 3:
				fileStatus = "Head of Household";
				break;
			}
			System.out.println("\n" + fileStatus);
			tax2001.setTFilingStatus(status);
			for(int amt: taxableIncome) {
				tax2001.setTaxableIncome(amt);
				System.out.println("$" + amt + ": Tax = " + tax2001.getTax());
			}
		}
		System.out.println("\n2009 taxes");
		for(int status: taxStatus) {
			String fileStatus;
			switch(status) {
			default:
				fileStatus = "Single";
				break;
			case 1:
				fileStatus = "Married filing jointly\nor qualifying widow(er)";
				break;
			case 2:
				fileStatus = "Married filing seperately";
				break;
			case 3:
				fileStatus = "Head of Household";
				break;
			}
			System.out.println("\n" + fileStatus);
			tax2009.setTFilingStatus(status);
			for(int amt: taxableIncome) {
				tax2009.setTaxableIncome(amt);
				System.out.println("$" + amt + ": Tax = " + tax2009.getTax());
			}
		}
	}

}
