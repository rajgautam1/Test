package method.java;

public class ArthematicOperation {
static void divide() {
	int x = 20;
	int y = 5;
	int divide = x/y; 
	System.out.println("Divide : " + divide );
}
static void mul() {
int x = 25;
int y = 5;
int mul = x*y; 
System.out.println(" Mul : " + mul );
}
static void squareRoot() {
	int x = 25; 
	System.out.println("Squareroot : " + Math.sqrt(x));
}

	
	public static void main(String[] args) {
		divide();
		mul();
		squareRoot();
	}

}
