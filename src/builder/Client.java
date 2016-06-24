package builder;

public class Client {

	public static void main(String[] args) {
		PersonBuilder fatbuilder = new FatPersonBuilder();
		PersonBuilder thinbuilder = new ThinPersonBuilder();
		Director director = new Director();
		director.setBuilder(fatbuilder);
		director.buildPerson();

		director.setBuilder(thinbuilder);
		director.buildPerson();
	}

}
