package ControlStatements;

public class IfElseStatements {

	public static void main(String[] args) {
		int temp = 50;
		if ( temp <= 40) {
			System.out.println("Its a cold day");
		}
		else if(temp>40 && temp <=60) {
			System.out.println("its nice day.");
		}
		else {
			System.out.println("Its a hot day.");
		}
	}

}
