package builder;

public class FatPersonBuilder implements PersonBuilder {

	@Override
	public void bulidHead() {
		System.out.println("build head of the fat person...");
	}

	@Override
	public void buildBody() {
		System.out.println("build body of the fat person...");
	}

	@Override
	public void buildLeftArm() {
		System.out.println("build left arm of the fat person...");
	}

	@Override
	public void buildRightArm() {
		System.out.println("build right arm of the fat person...");
	}

	@Override
	public void buildLeftLeg() {
		System.out.println("build left leg of the fat person...");
	}

	@Override
	public void buildRightLeg() {
		System.out.println("build right leg of the fat person...");
	}
	
}
