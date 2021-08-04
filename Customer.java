import java.util.ArrayList;
import java.util.List;

public class Customer {
	static int customerId;
	String customerName;
	int planId = -1;
	devSupport supportId;
	List<Domains> domains = new ArrayList<Domains>();
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public devSupport getSupportId() {
		return supportId;
	}
	public void setSupportId(devSupport supportId) {
		this.supportId = supportId;
	}
	public List<Domains> getDomains() {
		return domains;
	}
	public void setDomains(List<Domains> domains) {
		this.domains = domains;
	}
	public void addDomain(Domains d)
	{
		domains.add(d);
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Customer(String customerName) {
		this.customerId = this.customerId+1;
		this.customerName = customerName;
	}
	public int getPlanId() {
		return planId;
	}
	public void setPlanId(int planId) {
		this.planId = planId;
	}
	public Customer(int customerId, String customerName, int planId) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.planId = planId;
	}
	
}
