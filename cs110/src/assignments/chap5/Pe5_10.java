package assignments.chap5;

public class Pe5_10 {

	/**
	 * @param args
	 */
	public static boolean isPrime(int number) {
		for (int divisor = 2; divisor <= number/2; divisor++) {
			if (number % divisor == 0) { // if true is not prime
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// find the number of primes less than 10,000
		final int HIGH_NUMBER = 10000;
		int primeCount = 1; //count for 2 then start loop at 3
		boolean prime;
		
		for (int i = 3; i <= HIGH_NUMBER; i += 2) {
			prime = isPrime(i);
			if (prime) {
				primeCount ++;
			}
		}
		System.out.println("There are " + primeCount + " prime numbers less than " + HIGH_NUMBER);

	}

}
