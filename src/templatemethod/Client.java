package templatemethod;

public class Client {

	public static void main(String[] args) {
		System.out.println("A:");
		TestPaper A = new TestPaperA();
		A.TestQuestion1();
		A.TestQuestion2();
		A.TestQuestion3();
		
		System.out.println("B:");
		TestPaper B = new TestPaperB();
		B.TestQuestion1();
		B.TestQuestion2();
		B.TestQuestion3();
	}
}
