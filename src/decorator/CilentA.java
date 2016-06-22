package decorator;

public class CilentA {

	public static void main(String[] args) {
		Engineer person = new Engineer("slipper");
		JeanA jean = new JeanA(person);
		TShirtsA tshirts = new TShirtsA(jean);
		tshirts.show();
	}

}
