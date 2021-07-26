package ControlStatements;

public class MultiplicationTableUsingIfWhile {

	public static void main(String[] args) {
		
		int num1 = 4;
		int num2 = 5;
		int i = 0;
		int j = 0;
		while (i < 10) {
			System.out.println(num1 +"*" + (i+1) + "=" + (num1 * (i+1))) ;
			i = i+1;
		}
		System.out.println("-------------------");
   do {
	   System.out.println(num2 +"*" + (j+1) + "=" + (num2 * (j+1))) ;
	   j = j+1;
   }
   while (j < 10);
   j = j + 1; 
 }}