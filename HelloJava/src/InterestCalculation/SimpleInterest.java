package InterestCalculation;

import java.text.NumberFormat;
import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
	
	System.out.print("Principle : ");
double principle = scanner.nextDouble();

  System.out.print("Period : ");
float period = scanner.nextFloat();

System.out.print("Rate :");
float rate = scanner.nextFloat();
double SimpleInterest = (principle*period*rate)/100;
String Interest = NumberFormat.getCurrencyInstance().format(SimpleInterest);
System.out.println("Simple Interest : " + Interest);

	}

}
