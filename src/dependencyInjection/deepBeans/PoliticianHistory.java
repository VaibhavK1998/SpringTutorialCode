package dependencyInjection.deepBeans;
public class PoliticianHistory {

	private String partyName;
	private int established;
	public String getPartyName() {
		return partyName;
	}
	public void setPartyName(String partyName) {
		this.partyName = partyName;
	}
	public int getEstablished() {
		return established;
	}
	public void setEstablished(int established) {
		this.established = established;
	}
	@Override
	public String toString() {
		String value=getPartyName()+" "+getEstablished();
		return value;
	}
}
