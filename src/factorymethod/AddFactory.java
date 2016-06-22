package factorymethod;

public class AddFactory implements OperationFactory {

	@Override
	public Operation createOperation() {
		return new OperationAdd();
	}
}
