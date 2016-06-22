package decorator;

public class TShirtsA extends ClothingA {

	public TShirtsA(Person person) {
		super(person);
	}

	@Override
	public void show() {
		super.show();
		System.out.print(" T恤衫");
	}
}
