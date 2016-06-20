package simplefactory;

public class OperationMul extends Operation {

	public OperationMul() {
		setOperate("*");
	}
	@Override
	public double getResult() {
		return getNumA() * getNumB();
	}
	@Override
	public void print() throws Exception {
		super.print();
	}
}
