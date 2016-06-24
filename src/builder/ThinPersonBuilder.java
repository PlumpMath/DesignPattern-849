package builder;

public class ThinPersonBuilder implements PersonBuilder {

	@Override
	public void bulidHead() {
		System.out.println("build head of the thin person...");
	}

	@Override
	public void buildBody() {
		System.out.println("build body the thin person...");
	}

	@Override
	public void buildLeftArm() {
		System.out.println("build left arm the thin person...");
	}

	@Override
	public void buildRightArm() {
		System.out.println("build right arm the thin person...");
	}

	@Override
	public void buildLeftLeg() {
		System.out.println("build left leg the thin person...");
	}

	@Override
	public void buildRightLeg() {
		System.out.println("build right leg the thin person...");
	}

}
