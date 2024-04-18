package autowiring.beans5;
//lecture 11
public class Market_AutowiringByXml {

	private String marketName;
	private int established;
	private MarketShopsHelper mHelper;//  note for autowire mode=byType we need to give same name to the bean class which we given here to the class of the object 
	public String getMarketName() {
		return marketName;
	}
	public void setMarketName(String marketName) {
		this.marketName = marketName;
	}
	public int getEstablished() {
		return established;
	}
	public void setEstablished(int established) {
		this.established = established;
	}
	public MarketShopsHelper getmHelper() {
		return mHelper;
	}
	public void setmHelper(MarketShopsHelper mHelper) {
		this.mHelper = mHelper;
	}
	
	public void display() {
		System.out.println("marketName: "+marketName);
		System.out.println("established: "+established);
		System.out.println("mHelper: "+mHelper);
	}
}
