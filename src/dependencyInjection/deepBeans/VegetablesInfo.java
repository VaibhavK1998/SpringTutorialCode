package dependencyInjection.deepBeans;

public class VegetablesInfo {
	private String Vegetablename;
	private int price;
	
	public VegetablesInfo(String vegetablename, int price) {
		
		this.Vegetablename = vegetablename;
		this.price = price;
	}

	@Override
	public String toString() {
		return "DI_By_constructorArg_Vegetables [Vegetablename=" + Vegetablename + ", price=" + price + "]";
	}

}
