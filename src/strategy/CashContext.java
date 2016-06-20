package strategy;

public class CashContext {
	private CashSuper cashsuper = null;
	
	public CashContext(String type) {
		switch (type) {
		case "正常收费":
			this.cashsuper = new CashNormal();
			break;
		case "打八折":
			this.cashsuper = new CashRebate(0.8);
			break;
		case "每满400减100":
			this.cashsuper = new CashReturn(400, 100);
			break;
		default:
			break;
		}
		
	}
	
	public double getResult(double money){
		return cashsuper.acceptCash(money);
	}
	
}
