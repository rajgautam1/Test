package Static;

public class FruitDemo {
int price = 30;
static void apple () {
	System.out.println("I like apple.");
}
	public static void main(String[] args) {
		FruitDemo fr = new FruitDemo();
			fr.apple();          //Internal defination by system.
			FruitDemo.apple();  // both are same
		}

	}


