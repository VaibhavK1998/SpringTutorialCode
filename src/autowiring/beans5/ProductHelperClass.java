package autowiring.beans5;
public class ProductHelperClass {

	private int productSlab;
	private String productCategory;
	public int getProductSlab() {
		return productSlab;
	}
	public void setProductSlab(int productSlab) {
		this.productSlab = productSlab;
	}
	public String getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}
	@Override
	public String toString() {
		return "ProductHelperClass [productSlab=" + productSlab + ", productCategory=" + productCategory + "]";
	}
}
