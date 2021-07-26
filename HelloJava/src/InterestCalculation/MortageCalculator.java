package InterestCalculation;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortageCalculator {

	public static void main(String[] args) {
		
		        final  int percent = 100;
		        final byte  NumberOfMonths = 12;

		     Scanner scanner =  new Scanner(System.in);

		        System.out.print("Principle: ");
		         int Principle = scanner.nextInt();
		        System.out.println(Principle);

		        System.out.print("Annual Interest Rate: ");
		       float InterestRate = scanner.nextFloat();
		float interest = (InterestRate / percent) /NumberOfMonths;
		        System.out.println(interest);

		        System.out.print("Period (Years): ");
		        int years = scanner.nextInt();
		        float MonthsInYear = years * NumberOfMonths;
		        System.out.println(MonthsInYear);

		        double mortageAmount = Principle * (interest * Math.pow( 1 + interest,MonthsInYear))/(Math.pow(1+interest,years))-1;
		        String Mortgage = NumberFormat.getCurrencyInstance().format(mortageAmount);
		        System.out.println("Interest " + Mortgage);

		    }
		}
