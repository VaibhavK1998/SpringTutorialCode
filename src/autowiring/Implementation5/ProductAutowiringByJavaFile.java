package autowiring.Implementation5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import autowiring.beans5.Product_AutowiringbyJavaAnnot;
import autowiring.resources4.ProductJavaConfigFile;

public class ProductAutowiringByJavaFile {

	public static void main(String[] args) {
		ApplicationContext apt=new AnnotationConfigApplicationContext(ProductJavaConfigFile.class);
		Product_AutowiringbyJavaAnnot at=apt.getBean(Product_AutowiringbyJavaAnnot.class);
		at.display();

	}

}
