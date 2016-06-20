package simplefactory;

public class OperationAdd extends Operation{

	public OperationAdd() {
		setOperate("+");
	}
	
	@Override
	public double getResult() {
		return getNumA() + getNumB();
	}
	
	@Override
	public void print() throws Exception {
		super.print();
	}
}
