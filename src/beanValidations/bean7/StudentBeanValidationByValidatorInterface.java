package beanValidations.bean7;
//lecture 15
public class StudentBeanValidationByValidatorInterface {

	private String name;
	private int rollNo;
	private String schoool;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getSchoool() {
		return schoool;
	}
	public void setSchoool(String schoool) {
		this.schoool = schoool;
	}
	public void display() {
		System.out.println("name :"+name);
		System.out.println("rollNo :"+rollNo);
		System.out.println("schoool :"+schoool);
	}
}
