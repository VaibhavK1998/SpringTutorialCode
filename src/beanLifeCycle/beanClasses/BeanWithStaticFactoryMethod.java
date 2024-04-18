package beanLifeCycle.beanClasses;
//lecture 6 note if we wan't to create object of bean who have argument constructor then we use static factory method.
public class BeanWithStaticFactoryMethod {
	private String name;
	private int id;
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
	public void display() {
		System.out.print("display method call");
	}
	
	public BeanWithStaticFactoryMethod(int a) {
		System.out.println("consturctor call");
		System.out.println(a);
		
	}
	
	public static BeanWithStaticFactoryMethod lifeCycle() { //note: name of this method we use in xml file as name of factory-method patameter as value //if we wan't to create object of bean who have argument constructor then we use static factory method.
		System.out.println("static factory method call");
		return new BeanWithStaticFactoryMethod(10);
		
	}

}
