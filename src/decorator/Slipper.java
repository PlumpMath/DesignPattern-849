package decorator;

public class Slipper extends Clothing {
	@Override
	public void show() {
		super.show();
		System.out.print(" 拖鞋");
	}
}
