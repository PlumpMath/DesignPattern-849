package decorator;

public class TShirts extends Clothing {

	@Override
	public void show() {
		super.show();
		System.out.print(" T恤衫");
	}
}
