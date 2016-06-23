package facade;

public class Facade {
	private SubsystemOne one;
	private SubsystemTwo two;
	private SubsystemThree three;
	private SubsystemFour four;
	
	public Facade() {
		one = new SubsystemOne();
		two = new SubsystemTwo();
		three = new SubsystemThree();
		four = new SubsystemFour();
	}
	
	public void methodA() {
		one.methodOne();
		four.methodFour();
	}
	
	public void methodB() {
		two.methodTwo();
		three.methodThree();
	}
	
	public void methodC() {
		one.methodOne();
		two.methodTwo();
		three.methodThree();
		four.methodFour();
	}
}
