package ControlStatements;

import java.util.Scanner;

public class LoopCheck {

	public static void main(String[] args) {
	
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the year :");
		int year = scan.nextInt();
		scan.close();
		if ((year % 4 == 0) && (year % 100 !=0) || (year % 400 == 0)){
			System.out.println(year + "  is leap year");
		}
		  //(year % 100 == 0 && year % 400 ==0) {
		else  System.out.println(year + " is not leap year");
				}
	
		}

