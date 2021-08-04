
public class Domains {
	int domainId;
	String domainName;
	boolean availability;
	String category;
	boolean blocked =false;
	int price;
	public Domains(int domainId, String domainName, boolean availability, String category, int price) {
		this.domainId = domainId;
		this.domainName = domainName;
		this.availability = availability;
		this.category = category;
		this.price = price;
	}
	public boolean isBlocked() {
		return blocked;
	}
	public void setBlocked(boolean blocked) {
		this.blocked = blocked;
	}
	public int getDomainId() {
		return domainId;
	}
	public void setDomainId(int domainId) {
		this.domainId = domainId;
	}
	public String getDomainName() {
		return domainName;
	}
	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}
	public boolean isAvailability() {
		return availability;
	}
	public void setAvailability(boolean availability) {
		this.availability = availability;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
