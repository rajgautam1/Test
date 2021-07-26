package ControlStatements;

import java.util.Scanner;

public class rough {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter the temp: ");
Scanner scan = new Scanner(System.in);
int temp = scan.nextInt();
if (temp <= 30) {
	System.out.println("Cool day");
}else if (temp > 30 && temp <= 50) {
	System.out.println("Normal day");
} else {
	System.out.println("Hot day");
}
	}

}
