package number;

public class SwappingValue {

	public static void main(String[] args) {
		int a = 20;
		int b = 30;
		System.out.println("before swapping : a , b : " + a + " , " + b);
		a = a + b;
		b = a - b;
		a = a - b;
		
System.out.println("After swapping : a , b : " + a + "," + b);
	}

}
