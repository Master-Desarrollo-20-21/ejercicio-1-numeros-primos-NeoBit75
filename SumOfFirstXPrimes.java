
public class SumOfFirstXPrimes {

	public static void main(String[] args) {
		
		int sum = 0;
		final int X = 50;
		int numberOfPrimesDiscovered = 0;
		int numberToCheck = 2;
		
		while (numberOfPrimesDiscovered < X) {
			int numberOfDivisors = 0;
			
			for (int divisor = 2; divisor <= numberToCheck; divisor++) {
				if (numberToCheck % divisor == 0) numberOfDivisors++;
				if (numberOfDivisors == 2) break;
			}
			
			if (numberOfDivisors == 1) {
				sum += numberToCheck;
				numberOfPrimesDiscovered++;
			}
			
			numberToCheck++;
		}
		
		System.out.println("The sum of first " + X + " primes is " + sum);

	}

}
