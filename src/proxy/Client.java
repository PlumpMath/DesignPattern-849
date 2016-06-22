package proxy;

public class Client {

	public static void main(String[] args) {
		Girl girl = new Girl();
		girl.setName("cat");
		//Pursuit pursuit = new Pursuit(girl);
		Proxy proxy = new Proxy(girl);
		
		proxy.giveFlowers();
		proxy.giveDolls();
		proxy.giveChocolate();
	}

}
