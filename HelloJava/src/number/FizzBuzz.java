package number;

public class FizzBuzz {

	public static void main(String[] args) {
		// input 1 to 100 and print FizzBuzz if number is divisible by  3 and 5
		// print fizz when divisible by 3 and print buzz when divisible by 5
		for (int  i = 0; i <=100; i++) {
			if ( i % 3 == 0  && i % 5 == 0) {
				System.out.println("Fizzbuzz : " + i);
			}else if ( i % 3 == 0) {
				System.out.println("Fizz :  " + i );
			} else {
				System.out.println("Buzz : " + i);
			}
		}
		System.out.println("\n");
		}
	}
