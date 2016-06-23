package prototype;

public class Client {

	public static void main(String[] args) throws CloneNotSupportedException {
		Resume resume1 = new Resume();
		resume1.setPersonalInfo("slipper", 24, "男");
		resume1.setWorkExperience("2015-2016", "xxx公司");
		
		Resume resume2 = (Resume)resume1.clone();
		resume2.setPersonalInfo("slipper", 25, "男");
		
		Resume resume3 = (Resume)resume2.clone();
		resume3.setWorkExperience("2014-2015", "xxx公司");
		
		resume1.display();
		resume2.display();
		resume3.display();
	}

}
