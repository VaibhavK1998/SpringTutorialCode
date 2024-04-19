package xmTagsInfo.bean6;

public class OldParts {
	private String OldPartName;
	private int OldPartid;
	private String storeName;
	
	public String getStoreName() {
		return storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	
	public String getOldPartName() {
		return OldPartName;
	}
	public void setOldPartName(String oldPartName) {
		OldPartName = oldPartName;
	}
	public int getOldPartid() {
		return OldPartid;
	}
	public void setOldPartid(int oldPartid) {
		OldPartid = oldPartid;
	}
	public void display() {
		System.out.println("OldPartName: "+OldPartName);
		System.out.println("OldPartId: "+OldPartid);
		System.out.println("storeName: "+storeName);
	}
}
