import java.util.ArrayList;
import java.util.List;

public class Admin {
	static List<Customer> customers;

	public Admin() {
		customers = new ArrayList<Customer>();
	}

	public static List<Customer> getCustomers() {
		return customers;
	}

	public static void addCustomers(Customer c) {
		customers.add(c);
	}
	
	
}
