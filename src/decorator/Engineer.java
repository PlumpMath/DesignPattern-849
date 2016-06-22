package decorator;

public class Engineer extends Person {
	
	public Engineer(String name) {
		super(name);
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.print(getName() + " engineer:");
	}


}
