package decorator;

public class Client {

	public static void main(String[] args) {
		Engineer person = new Engineer("slipper");
		TShirts tshirts = new TShirts();
		Jean jean = new Jean();
		Slipper slipper = new Slipper();
		
		tshirts.decorate(person);
		jean.decorate(tshirts);
		slipper.decorate(jean);
		
		slipper.show();
	}

}
