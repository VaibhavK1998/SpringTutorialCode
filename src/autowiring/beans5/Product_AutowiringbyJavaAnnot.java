package autowiring.beans5;
//lecture 12
import org.springframework.beans.factory.annotation.Autowired;

public class Product_AutowiringbyJavaAnnot {
private String productName;
private int productPrice;

@Autowired// this Annotation is used for dependency injection automatically
private ProductHelperClass pHelperClass;

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
public ProductHelperClass getpHelperClass() {
	return pHelperClass;

}

public void setpHelperClass(ProductHelperClass pHelperClass) {
	this.pHelperClass = pHelperClass;
}

public void display() {
	System.out.println("productName: "+productName);
	System.out.println("productPrice: "+productPrice);
	System.out.println("pHelperClass: "+pHelperClass);
}
}
