package strategy;

public class CashRebate extends CashSuper{

	private double rebate;
	public CashRebate(double rebate) {
		this.rebate = rebate;
	}
	@Override
	protected double acceptCash(double money) {
		// TODO Auto-generated method stub
		return money * rebate;
	}

}
