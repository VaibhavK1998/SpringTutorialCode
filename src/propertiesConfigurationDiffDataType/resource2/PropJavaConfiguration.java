package propertiesConfigurationDiffDataType.resource2;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import propertiesConfigurationDiffDataType.beanT.PropWithJavaConf;

@Configuration
@PropertySource("./propertiesConfigurationDiffDataType/resource2/items.properties")
public class PropJavaConfiguration {
	
	
	@Value("${p.id}")// note $symbol we need to write must. it use to load properties file.
	private int id;
	@Value("${p.name}")
	private String name;
	@Value("#{${valuesMap}}") // refer website how to use value for Map https://www.baeldung.com/spring-value-annotation
	private Map<String, String> items;
	
	@Bean("data")
	public PropWithJavaConf getData() {
		PropWithJavaConf pf=new PropWithJavaConf();
		pf.setId(id);
		pf.setName(name);
		pf.setItems(items);
		return pf;
	}

}
