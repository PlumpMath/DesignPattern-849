package builder;

public class Director {
	private PersonBuilder builder;

	public PersonBuilder getBuilder() {
		return builder;
	}

	public void setBuilder(PersonBuilder builder) {
		this.builder = builder;
	}
	
	public void buildPerson(){
		builder.bulidHead();
		builder.buildBody();
		builder.buildLeftArm();
		builder.buildRightArm();
		builder.buildLeftLeg();
		builder.buildRightLeg();
	}
}
