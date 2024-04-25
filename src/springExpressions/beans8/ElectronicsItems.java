package springExpressions.beans8;

public class ElectronicsItems {

	private String name;
	private String size;
	private String itemId;
	private ElectronicsPrice ePrice;
	public ElectronicsPrice getePrice() {
		return ePrice;
	}
	public void setePrice(ElectronicsPrice ePrice) {
		this.ePrice = ePrice;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	
	public void display() {
		System.out.println("name: "+name+" size: "+size+" itemid: "+itemId+" "+ePrice);
	}
	}