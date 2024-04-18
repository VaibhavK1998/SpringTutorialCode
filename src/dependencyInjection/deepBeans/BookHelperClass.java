package dependencyInjection.deepBeans;

public class BookHelperClass {
private String shopName;
private String shopKeeperName;
public String getShopName() {
	return shopName;
}
public void setShopName(String shopName) {
	this.shopName = shopName;
}
public String getShopKeeperName() {
	return shopKeeperName;
}
public void setShopKeeperName(String shopKeeperName) {
	this.shopKeeperName = shopKeeperName;
}

@Override
public String toString() {
	return "BookHelperClass [shopName=" + shopName + ", shopKeeperName=" + shopKeeperName + "]";
}
}
