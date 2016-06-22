package proxy;

public class Pursuit implements GiveGift {

	private Girl girl;
	
	public Pursuit(Girl girl) {
		this.girl = girl;
	}
	@Override
	public void giveFlowers() {
		System.out.println(girl.getName() + ",give you flowers.");
	}

	@Override
	public void giveDolls() {
		System.out.println(girl.getName() + ",give you dolls.");
	}

	@Override
	public void giveChocolate() {
		System.out.println(girl.getName() + ",Give you chocolate.");
	}

}
