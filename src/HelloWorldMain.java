
public class HelloWorldMain {

	public static void main(String[] args) {

		System.out.println("Hello World! Hello Dan!");
		System.out.println("This code is maintaned in git!");

		SimpleMath sm = new SimpleMath();
		sm.setX(5);
		sm.setY(3);

		System.out.println("Sum=" + sm.Sum());
		System.out.println("Difference=" + sm.Difference());
		System.out.println("Product=" + sm.Product());
	}

}
