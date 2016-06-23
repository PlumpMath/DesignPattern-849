package prototype;

public class Resume implements Cloneable {
	private String name;
	private int age;
	private String sex;
	
	private WorkExperience workexperience ;
		
	public Resume() {
		this.workexperience = new WorkExperience();
	}
	
	public void setPersonalInfo(String name,int age,String sex){
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	
	public void setWorkExperience(String timeArea,String company){
		this.workexperience.setTimeArea(timeArea);
		this.workexperience.setCompany(company);
	}
	
	public void display(){
		System.out.println(name + " " + sex + " " + age);
		System.out.println("工作经历:" + this.workexperience.getTimeArea() + " " + this.workexperience.getCompany());
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Resume resume = (Resume)super.clone();
		resume.workexperience = (WorkExperience)workexperience.clone();
		return resume;
	}
}
