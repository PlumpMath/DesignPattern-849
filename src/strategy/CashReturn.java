package strategy;

public class CashReturn extends CashSuper {

	private double moneycondition;
	private double moneyreturn;
	
	public CashReturn(double moneycondition,double moneyreturn) {
		this.moneycondition = moneycondition;
		this.moneyreturn = moneyreturn;
	}

	@Override
	protected double acceptCash(double money) {
		return money - Math.floor(money / moneycondition) * moneyreturn;
	}

}
