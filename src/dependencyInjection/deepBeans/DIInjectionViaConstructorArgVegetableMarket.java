package dependencyInjection.deepBeans;

public class DIInjectionViaConstructorArgVegetableMarket {
	private String MarketName;
	private String place;
	private VegetablesInfo vegetablesInfo;
	
	public DIInjectionViaConstructorArgVegetableMarket(String marketName, String place, VegetablesInfo vegetablesInfo) {
		this.MarketName = marketName;
		this.place = place;
		this.vegetablesInfo = vegetablesInfo;
	}
	
	public void display() {
		System.out.println("MarketName: "+MarketName);
		System.out.println("Place: "+place);
		System.out.println("vegetablesInfo: "+vegetablesInfo);
	}

}
