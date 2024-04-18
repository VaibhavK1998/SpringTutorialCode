package dependencyInjection.deepBeans;

public class Politician_DI_BySetterMethod {
	private String name;
	private int Age;
	private PoliticianHistory politicianHistory;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public PoliticianHistory getPoliticianHistory() {
		return politicianHistory;
	}
	public void setPoliticianHistory(PoliticianHistory politicianHistory) {
		this.politicianHistory = politicianHistory;
	}

	public void display() {
		System.out.println("Name:"+name);
		System.out.println("Age:"+Age);
		System.out.println("PoliticianHistory:"+politicianHistory);
	}
}
