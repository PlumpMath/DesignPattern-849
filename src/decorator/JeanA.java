package decorator;

public class JeanA extends ClothingA {

	public JeanA(Person person) {
		super(person);
	}
	
	public void show() {
		super.show();
		System.out.print(" 牛仔裤");
	}
}
