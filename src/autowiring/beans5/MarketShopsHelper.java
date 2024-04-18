package autowiring.beans5;

public class MarketShopsHelper {

	private String ShopName;
	private String ShopAddress;
	public String getShopName() {
		return ShopName;
	}
	public void setShopName(String shopName) {
		ShopName = shopName;
	}
	public String getShopAddress() {
		return ShopAddress;
	}
	public void setShopAddress(String shopAddress) {
		ShopAddress = shopAddress;
	}
	
	@Override
	public String toString() {
		return "MarketShopsHelper [ShopName=" + ShopName + ", ShopAddress=" + ShopAddress + "]";
	}
}
