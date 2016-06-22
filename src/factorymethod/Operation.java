package factorymethod;

public abstract class Operation {
	private double numA;
	private double numB;
	private String operate;
	public double getNumA() {
		return numA;
	}
	public void setNumA(double numA) {
		this.numA = numA;
	}
	public double getNumB() {
		return numB;
	}
	public void setNumB(double numB) {
		this.numB = numB;
	}
	public String getOperate() {
		return operate;
	}
	public void setOperate(String operate) {
		this.operate = operate;
	}
	public abstract double getResult() throws Exception;
	
	public void print() throws Exception{
		System.out.println(numA + operate + numB + "=" + getResult());
	}
}
