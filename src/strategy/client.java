package strategy;

public class client {
	public static void main(String[] args) {
		double money = 900;
		String type1 = "正常收费";
		String type2 = "打八折";
		String type3 = "每满400减100";
		CashContext cashcontext = new CashContext(type1);
		double result1 = cashcontext.getResult(money);
		System.out.println(result1);
		
		cashcontext = new CashContext(type2);
		double result2 = cashcontext.getResult(money);
		System.out.println(result2);
		
		cashcontext = new CashContext(type3);
		double result3 = cashcontext.getResult(money);
		System.out.println(result3);
	}
}
