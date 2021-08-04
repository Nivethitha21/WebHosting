
public class Plans {
	int planId;
	public int getPlanId() {
		return planId;
	}
	public void setPlanId(int planId) {
		this.planId = planId;
	}
	String planName;
	int websiteCount;
	public int getWebsiteCount() {
		return websiteCount;
	}
	public void setWebsiteCount(int websiteCount) {
		this.websiteCount = websiteCount;
	}
	int storage;
	int dbCount;
	int freeDomains;
	boolean devSupport;
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	public int getStorage() {
		return storage;
	}
	
	public Plans(int planId, String planName, int websiteCount, int storage, int dbCount, int freeDomains,
			boolean devSupport) {
		this.planId = planId;
		this.planName = planName;
		this.websiteCount = websiteCount;
		this.storage = storage;
		this.dbCount = dbCount;
		this.freeDomains = freeDomains;
		this.devSupport = devSupport;
	}
	public void setStorage(int storage) {
		this.storage = storage;
	}
	public int getDbCount() {
		return dbCount;
	}
	public void setDbCount(int dbCount) {
		this.dbCount = dbCount;
	}
	public int getFreeDomains() {
		return freeDomains;
	}
	public void setFreeDomains(int freeDomains) {
		this.freeDomains = freeDomains;
	}
	public boolean isDevSupport() {
		return devSupport;
	}
	public void setDevSupport(boolean devSupport) {
		this.devSupport = devSupport;
	}
	
}
