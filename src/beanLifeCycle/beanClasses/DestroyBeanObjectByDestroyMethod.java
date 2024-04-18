package beanLifeCycle.beanClasses;

public class DestroyBeanObjectByDestroyMethod {
	private String productName;
	private int productPrice;
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	
public void initializeProductValue() {
	productName="rahul";
	productPrice=1200;
}
public void display() {
	System.out.println("Name: "+productName);
	System.out.println("price: "+productPrice);
}

public void destory() {// we use this method name in xml file as destroy-method="destroy"
	System.out.println("destroy method call");
	productName="";
	productPrice=0;
}
}
