package autowiring.resources4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import autowiring.beans5.ProductHelperClass;
import autowiring.beans5.Product_AutowiringbyJavaAnnot;

@Configuration("productInfo")
public class ProductJavaConfigFile {
	
	@Bean
	public ProductHelperClass getProductDetail() {
		ProductHelperClass productHelperClass=new ProductHelperClass();
		productHelperClass.setProductCategory("jewellary");
		productHelperClass.setProductSlab(10-20);
		return productHelperClass;
	}

	@Bean
	public Product_AutowiringbyJavaAnnot getProduct() {
		Product_AutowiringbyJavaAnnot pd=new Product_AutowiringbyJavaAnnot();
		pd.setProductName("neckless");
		pd.setProductPrice(2000);
		//pd.setpHelperClass(getProductDetail());
		return pd;
	}
}
