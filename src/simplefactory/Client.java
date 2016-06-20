package simplefactory;

public class Client {
	public static void main(String[] args) throws Exception {
		Operation operationadd = OperateFactory.createOperation("+");
		operationadd.setNumA(1);
		operationadd.setNumB(2);
		double result1 = operationadd.getResult();
		System.out.println(result1);
		operationadd.print();
		
		Operation operationsub = OperateFactory.createOperation("-");
		operationsub.setNumA(2);
		operationsub.setNumB(3);
		double result2 = operationsub.getResult();
		System.out.println(result2);
		operationsub.print();
		
		Operation operationmul = OperateFactory.createOperation("*");
		operationmul.setNumA(5);
		operationmul.setNumB(0);
		double result3 = operationmul.getResult();
		System.out.println(result3);
		operationmul.print();
		
		Operation operationdiv = OperateFactory.createOperation("/");
		operationdiv.setNumA(9);
		operationdiv.setNumB(3);
		double result4 = operationdiv.getResult();
		System.out.println(result4);
		operationdiv.print();
		
	}
}
