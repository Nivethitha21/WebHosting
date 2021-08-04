import java.util.List;
import java.util.Scanner;

public class MainClass {
	
	public static void main(String[] args)
	{
		DataClass dc = new DataClass();
		System.out.println("1. Admin\n2.Customer\n3.Developer\n4.Quit");
		System.out.println("Enter Login Option:");
		List<Domains> domain = dc.getDomainsList();
		Admin admin = new Admin();
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			int ch = sc.nextInt();
			if(ch == 4)
				break;
		switch(ch)
		{
		case 1:System.out.println("1.View Domains\n2.View Plans\n3.View Progress\n4. Block Domain\n5.Delete Customer\n6.Logout");
				int adminChoice = sc.nextInt();
				while(true) {
					if(adminChoice == 6)
						break;
					switch(adminChoice)
					{
						case 1:
								for(int i = 0; i < domain.size(); i++)
								{
									Domains temp = domain.get(i);
									System.out.println(temp.getDomainId()+" "+temp.getDomainName());
								} 
									break;
						case 2:
							List<Plans> plan = dc.getPlansList();
							for(int i = 0; i < plan.size(); i++)
							{
								Plans temp = plan.get(i);
								System.out.println(temp.getPlanId()+" "+temp.getPlanName());
							}
							break;
						case 3:
							Developer dv = new Developer();
							List<devSupport> req = dv.getRequests();
							for(int i = 0; i < req.size(); i++) {
								devSupport temp = req.get(i);
									System.out.println("Request From: "+temp.getCustomerId()+" Status: "+temp.getStatus());
								}
						case 4: 
							System.out.println("Enter domain Id: ");
							int id = sc.nextInt();
							Domains temp = domain.get(id);
							temp.setBlocked(true);
							break;
						case 5: List<Customer> customerList = admin.getCustomers();
								System.out.println("Enter Customer Id to remove: ");
								int custId = sc.nextInt();
								customerList.remove(custId);
						default:System.out.println("Invalid Choice");
						break;
					}
					}
					break;
		case 2:System.out.println("Enter customer Name");
				String name = sc.next();
				Customer c1 = new Customer(name);
				admin.addCustomers(c1);
				while(true) {
				System.out.println("1.View/Purchase Plans\n2.View Domains\n3.Opt Developer Support\4.Track Progress\n5.LogOut");
				int choice = sc.nextInt();
				if(choice == 5)
					break;
				switch(choice)
				{
							case 1:List<Plans> plan = dc.getPlansList();
								for(int i = 0; i < plan.size(); i++)
								{
									Plans temp = plan.get(i);
									System.out.println(temp.getPlanId()+" "+temp.getPlanName());
								}
								System.out.println("Enter plan ID to choose");
								int planIdd = sc.nextInt();
								c1.setPlanId(planIdd-1);
								Plans p = plan.get(planIdd-1);
								System.out.println("Your Plan:"+p.getPlanName());
								break;
							case 2:
							for(int i = 0; i < domain.size(); i++)
							{
								Domains temp = domain.get(i);
								System.out.println(temp.getDomainId()+" "+temp.getDomainName());
							}
							System.out.println("Enter Domain to choose");
							Domains temp = domain.get(sc.nextInt()-1);
							System.out.println("Domain Name: "+temp.getDomainName());
							c1.addDomain(temp);
							temp.setAvailability(false);
							c1.setPlanId(sc.nextInt());
								break;
							case 3:
								if(c1.getPlanId() == -1) {
									System.out.println("Plan not chosen");
									break;
								}
								if(c1.getPlanId() == 0)
								{
								System.out.println("Dev Support not available for chosen Domain.");
								break;
								}
								Developer dv = new Developer();
								devSupport ds = new devSupport(c1.getCustomerId());
								c1.setSupportId(ds);
								dv.addRequest(ds);
								System.out.println("Requested");
								break;
							case 4: 
//						 default:System.out.println("Invalid Choice");
//						break;
				}
				}
				break;
		case 3: System.out.println("Enter name");
				Developer dev = new Developer(sc.next());
				List<devSupport> req = dev.getRequests();
				System.out.println("1.List requests\n.2Edit Status");
				int devChoice = sc.nextInt();
				if(devChoice == 1)
				{
					
					for(int i = 0; i < req.size(); i++) {
					devSupport temp = req.get(i);
						System.out.println("Request From: "+temp.getCustomerId()+" Status: "+temp.getStatus());
					}
				}
				else if(devChoice == 2)
				{
					System.out.println("Enter request Id to update");
					devSupport temp = req.get(sc.nextInt());
					System.out.println("Enter Status: Inprogress/Completed/Hosted");
					temp.setStatus(sc.next());					
				}
		}
	}
	}
}
