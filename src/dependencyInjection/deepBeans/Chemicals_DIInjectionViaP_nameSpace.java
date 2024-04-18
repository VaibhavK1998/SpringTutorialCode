package dependencyInjection.deepBeans;

public class Chemicals_DIInjectionViaP_nameSpace {
private String NameOfChemical;
private String priceOfchemical;
public String getNameOfChemical() {
	return NameOfChemical;
}
public void setNameOfChemical(String nameOfChemical) {
	NameOfChemical = nameOfChemical;
}
public String getPriceOfchemical() {
	return priceOfchemical;
}
public void setPriceOfchemical(String priceOfchemical) {
	this.priceOfchemical = priceOfchemical;
}
public void display() {
	System.out.println("Chemical:"+NameOfChemical);
	System.out.println("PriceOfchemical:"+priceOfchemical);
}
}
