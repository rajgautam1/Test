package number;

public class PrimeNumCheck {

	public static void main(String[] args) {
		int num = 53;
		int flag = 0;
		for (int i = 2; i < num/2; i++) {
			if( num % i == 0) {
				flag = 1;
			}
		}
if (flag == 0) 
	System.out.println("Num " + num +  " is a prime number.");
else 
	System.out.println("Num " + num + "  is not prime number.");
}	}

