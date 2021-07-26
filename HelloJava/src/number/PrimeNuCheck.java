package number;
import java.util.Scanner;

public class PrimeNuCheck {

	public static void main(String[] args) {
	int temp;
		boolean isPrime = true;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter any number : ");
		int num = scanner.nextInt();
	 // scan.close();
		
		for(int i = 2; i <= num/2; i++) {
			temp = num % i;
			if (temp == 0) {
				isPrime = false;
				break;
			}
		}
if (isPrime) 
	System.out.println(num + ", This is prime number");
else 
	System.out.println(num + ", this is not prime number");
	}
}