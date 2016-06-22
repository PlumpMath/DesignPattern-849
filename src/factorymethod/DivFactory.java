package factorymethod;

public class DivFactory implements OperationFactory {

	@Override
	public Operation createOperation() {
		return new OperationDiv();
	}

}
