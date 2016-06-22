package factorymethod;

public class OperationSub extends Operation {

	public OperationSub() {
		setOperate("-");
	}
	@Override
	public double getResult() {
		return getNumA() - getNumB();
	}
	@Override
	public void print() throws Exception {
		super.print();
	}
}
