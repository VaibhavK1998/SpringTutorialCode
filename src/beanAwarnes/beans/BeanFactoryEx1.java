package beanAwarnes.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
//lecture no:7
public class BeanFactoryEx1 implements BeanFactoryAware {
	private String rollNo;
	private int id;
	private HelperBeanFactory helperBeanFactory;
	private BeanFactory beanFactory;
	
	public String getRollNo() {
		return rollNo;
	}
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public HelperBeanFactory getHelperBeanFactory() {
		return helperBeanFactory;
	}
	public void setHelperBeanFactory(HelperBeanFactory helperBeanFactory) {
		this.helperBeanFactory = helperBeanFactory;
	}
	
	public void display() {
		System.out.println("roll No:"+rollNo);
		System.out.println("id:"+id);
		HelperBeanFactory helperBeanFactory=(HelperBeanFactory)beanFactory.getBean("obj2");
		System.out.println("addres:"+helperBeanFactory);
	
		
	}
	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		this.beanFactory=beanFactory;
		
	}

}
