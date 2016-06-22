package decorator;

public abstract class Clothing extends Person{

	private Person person;
	
	public void decorate(Person person){
		this.person = person;
	}

	@Override
	public void show() {
		person.show();
	}
}
