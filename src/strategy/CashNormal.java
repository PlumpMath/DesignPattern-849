package strategy;

public class CashNormal extends CashSuper{
	
	@Override
	protected double acceptCash(double money) {
		return money;
	}

}
