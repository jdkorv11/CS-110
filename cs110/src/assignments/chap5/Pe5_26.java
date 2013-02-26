package assignments.chap5;

public class Pe5_26 {

	/**
	 * displays the first 100 palindromic primes
	 */
	public static void main(String[] args) {
		int number = 2;
		int countOnLine = 0;
		
		for (int palPrimes = 0; palPrimes < 100; ) {
			if (countOnLine == 10) {
				System.out.println();
				countOnLine = 0;
			}
			if (isPalindrome(number) && isPrime(number)) {
				System.out.print(number + " ");
				
				countOnLine ++;
				palPrimes ++;
			}
			number ++;
		}
	}
	public static boolean isPrime(long number) {
		for (long factor = 2; factor <= Math.sqrt(number); factor ++) {
			if (number % factor == 0) {
				return false;
			}
		}
		return true;
	}
	public static boolean isPalindrome(long number) {
		String num = Long.toString(number);
		for(int front = 0, back = (num.length()-1); front < back; front ++, back --) {
			if (num.charAt(front) != num.charAt(back))
				return false;
		}
		return true;
	}

}
