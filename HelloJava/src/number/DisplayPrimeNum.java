package number;

public class DisplayPrimeNum {

	public static void main(String[] args) {
		int num = 0;
		int i;
		String primeNumbers = " ";
		for ( i = 0; i <= 200; i++) {
			int counter = 0;
			for (num = i; num >=1; num--) {
				
			if ( i % num == 0){
				counter = counter +  1;
			}
		}
	if (counter == 2) {
		primeNumbers = primeNumbers + i + " ,"; 
		}
	}
System.out.println("The prime numbers between 1 to 100 : ");
System.out.print(primeNumbers);
}}
