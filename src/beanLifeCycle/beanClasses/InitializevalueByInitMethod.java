package beanLifeCycle.beanClasses;

public class InitializevalueByInitMethod {
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
	
public void initializeProductValue() {//this is a method where we are initialing the value to variable and in .xml file we useinit-method="initializeProductValue"
	productName="rahul";
	productPrice=1200;
}
public void display() {
	System.out.println("Name: "+productName);
	System.out.println("price: "+productPrice);
}
}
