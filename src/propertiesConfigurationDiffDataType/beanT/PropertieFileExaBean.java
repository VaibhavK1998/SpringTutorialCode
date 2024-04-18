package propertiesConfigurationDiffDataType.beanT;
import java.util.Map;

public class PropertieFileExaBean {
	private String name;
	private String id;
	private Map<String, String> skills;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Map<String, String> getSkills() {
		return skills;
	}
	public void setSkills(Map<String, String> skills) {
		this.skills = skills;
	}
	public void display() {
		System.out.println(skills);
	}

}
