package factorymethod;

public class Client {

	public static void main(String[] args) throws Exception {
		AddFactory addfactory = new AddFactory();
		Operation add = addfactory.createOperation();
		add.setNumA(1);
		add.setNumB(2);
		add.print();
		
		SubFactory subfactory = new SubFactory();
		Operation sub = subfactory.createOperation();
		sub.setNumA(3);
		sub.setNumB(9);
		sub.print();
		
		MulFactory mulfactory = new MulFactory();
		Operation mul = mulfactory.createOperation();
		mul.setNumA(3);
		mul.setNumB(6);
		mul.print();
		
		DivFactory divfactory = new DivFactory();
		Operation div = divfactory.createOperation();
		div.setNumA(5);
		div.setNumB(2);
		div.print();
	}
}
