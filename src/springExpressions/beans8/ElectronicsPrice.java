package springExpressions.beans8;

public class ElectronicsPrice {
private float priceBeforeGst;
private float priceAfterGst;
private String itemId;
public String getItemId() {
	return itemId;
}
public void setItemId(String itemId) {
	this.itemId = itemId;
}
public float getPriceBeforeGst() {
	return priceBeforeGst;
}
public void setPriceBeforeGst(float priceBeforeGst) {
	this.priceBeforeGst = priceBeforeGst;
}
public float getPriceAfterGst() {
	return priceAfterGst;
}
public void setPriceAfterGst(float priceAfterGst) {
	this.priceAfterGst = priceAfterGst;
}
@Override
public String toString() {
	return "ElectronicsPrice [priceBeforeGst=" + priceBeforeGst + ", priceAfterGst=" + priceAfterGst + ", itemId="
			+ itemId + "]";
}


}
