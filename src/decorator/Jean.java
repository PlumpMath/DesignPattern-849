package decorator;

public class Jean extends Clothing {
	
	@Override
	public void show() {
		super.show();
		System.out.print(" 牛仔裤 ");
	}

}
