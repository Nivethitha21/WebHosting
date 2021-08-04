import java.util.ArrayList;
import java.util.List;

public class Developer {
	String name;
	static List<devSupport> requests = new ArrayList<devSupport>();
	public Developer(String name) {
		this.name = name;
	
	}
	public List<devSupport> getRequests()
	{
		return requests;
	}
	public Developer() {
	}
	public void addRequest(devSupport req)
	{
		requests.add(req);
	}
	
	
}
