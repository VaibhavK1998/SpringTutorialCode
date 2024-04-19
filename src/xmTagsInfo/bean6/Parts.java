package xmTagsInfo.bean6;
//lecture 14 beanPropery inheritance
public class Parts {

	private String Name;
	private int id;
	private String storeName;
	public String getStoreName() {
		return storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public void display() {
		System.out.println("Name: "+Name);
		System.out.println("id: "+id);
		System.out.println("storeName: "+storeName);
	}
}
