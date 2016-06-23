package facade;

public class Client {
	public static void main(String[] args) {
		Facade facade = new Facade(); 
		System.out.println("\nfacade.methodA():");
		facade.methodA();
		System.out.println("\nfacade.methodB():");
		facade.methodB();
		System.out.println("\nfacade.methodC():");
		facade.methodC();
	}
}
