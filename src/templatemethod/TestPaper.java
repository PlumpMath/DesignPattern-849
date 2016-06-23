package templatemethod;

public abstract class TestPaper {
	public void TestQuestion1(){
		System.out.println("题目一:1+1");
		System.out.println("答案:" + Answer1());
	}

	public void TestQuestion2(){
		System.out.println("题目二:1-1");
		System.out.println("答案:" + Answer2());
	}
	
	public void TestQuestion3(){
		System.out.println("题目三:1/1");
		System.out.println("答案:" + Answer3());
	}

	public String Answer1() {
		return "";
	}

	public String Answer2() {
		return "";
	}
	
	public String Answer3() {
		return "";
	}
	
	
}
