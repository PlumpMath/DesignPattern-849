package simplefactory;

public class OperationDiv extends Operation {

	public OperationDiv() {
		setOperate("/");
	}
	@Override
	public double getResult() throws Exception {
		if(getNumB() != 0){
			return getNumA() / getNumB();
		}else {
			throw new Exception("除数不能为0");
		}
	}

	@Override
	public void print() throws Exception {
		super.print();
	}
}
