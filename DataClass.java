import java.util.ArrayList;
import java.util.List;

public class DataClass {
	static List<Plans> plansList = new ArrayList<Plans>();
	static List<Domains> domainsList = new ArrayList<Domains>();
	public DataClass()
	{
		domainsList.add(new Domains(1,"abc.com",true,"Commercial",400));
		domainsList.add(new Domains(2,"abc.org",true,"Organization",580));
		domainsList.add(new Domains(3,"abc.me",true,"Personal",800));
		domainsList.add(new Domains(4,"xyz.com",false,"Commercial",450));
		plansList.add(new Plans(1,"Starter",1,30,1,0,false));
		plansList.add(new Plans(2,"Economy",5,100,10,1,true));
		plansList.add( new Plans(2,"Premium",Integer.MAX_VALUE,Integer.MAX_VALUE,25,2,true));
	}
	public static List<Plans> getPlansList() {
		return plansList;
	}
	public static List<Domains> getDomainsList() {
		return domainsList;
	}
	
	
	
} 
