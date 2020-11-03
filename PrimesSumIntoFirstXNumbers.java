
public class PrimesSumIntoFirstXNumbers {

	public static void main(String[] args) {
	
		int sum = 0;
		final int X = 50;
		
		for (int numberToCheck = 2; numberToCheck <= X; numberToCheck++) {
			
			int numberOfDivisors = 0;
			
			for (int divisor = 2; divisor <= numberToCheck; divisor++) {
				if (numberToCheck % divisor == 0) numberOfDivisors++;
				if (numberOfDivisors == 2) break;
			}
			
			if (numberOfDivisors == 1) sum += numberToCheck;
		}
		
		System.out.println(
				"The sum of the prime numbers into the " +
				X + " first ones is " + sum);
	}
	
}
