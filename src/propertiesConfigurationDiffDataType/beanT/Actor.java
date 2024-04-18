package propertiesConfigurationDiffDataType.beanT;
import java.io.Serializable;
//lecture 8
import java.lang.invoke.StringConcatFactory;
import java.util.List;

import org.springframework.expression.spel.ast.Identifier;

public class Actor {
	private String name;
	private int id;
	private List<String> awardsList;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<String> getAwardsList() {
		return awardsList;
	}
	public void setAwardsList(List<String> awardsList) {
		this.awardsList = awardsList;
	}

}
