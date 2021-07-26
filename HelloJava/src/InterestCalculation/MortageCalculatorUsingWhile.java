package InterestCalculation;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortageCalculatorUsingWhile {

	public static void main(String[] args) {

		final byte Percent = 100;
		final byte MonthsInYear = 12;
		int principle = 0;
		float monthlyInterestRate = 0;
		int years = 0;

		Scanner scanner = new Scanner(System.in);
		while (true) {

			System.out.print("Principle: ");
			principle = scanner.nextInt();
			if (principle >= 1000 && principle <= 1000000) {
				break;
			}
			System.out.println("Enter the value between $1000 to $1_000_000 :");
		}

		while (true) {
			System.out.print("Annual Interest rate :");
			float rate = scanner.nextFloat();
			if (rate >= 1 && rate <= 30) {
				monthlyInterestRate = rate / Percent / MonthsInYear;
				break;
			}
			System.out.println("Enter the value greater than 0 and less then and equal to 30: ");
		}
		while (true) {

			System.out.print("Period: ");
			years = scanner.nextInt();
			if (years > 0 && years <= 30) {
				int period = years * MonthsInYear;
				break;
			}
			System.out.println("Enter the period between 1 to 30 (years) : ");
		}

		double mortgage = principle * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, years))
				/ Math.pow(1 + monthlyInterestRate, years) - 1;
		String mortgageFormat = NumberFormat.getCurrencyInstance().format(mortgage);
		System.out.println("Mortgage:  " + mortgageFormat);
	}

}
