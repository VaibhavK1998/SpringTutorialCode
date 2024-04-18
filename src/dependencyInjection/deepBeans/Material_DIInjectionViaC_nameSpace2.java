package dependencyInjection.deepBeans;

public class Material_DIInjectionViaC_nameSpace2 {
private String NameOfMaterial;
private String priceOfMaterial;


public Material_DIInjectionViaC_nameSpace2(String nameOfMaterial, String priceOfMaterial) {
	
	this.NameOfMaterial = nameOfMaterial;
	this.priceOfMaterial = priceOfMaterial;
}


public void display() {
	System.out.println("Name of materialChemical:"+NameOfMaterial);
	System.out.println("PriceOfMaterial:"+priceOfMaterial);
}
}
