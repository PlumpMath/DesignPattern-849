package proxy;

public class Proxy implements GiveGift {

	private Pursuit pursuit;
	
	public Proxy(Girl girl) {
		pursuit = new Pursuit(girl);
	}
	
	@Override
	public void giveFlowers() {
		pursuit.giveFlowers();
	}

	@Override
	public void giveDolls() {
		pursuit.giveDolls();
	}

	@Override
	public void giveChocolate() {
		pursuit.giveChocolate();
	}

}
