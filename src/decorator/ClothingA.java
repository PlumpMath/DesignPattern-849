package decorator;

public class ClothingA extends Person {

	private Person person;
	
	public ClothingA(Person person) {
		this.person = person;
	}
	@Override
	public void show() {
		person.show();
	}

}
