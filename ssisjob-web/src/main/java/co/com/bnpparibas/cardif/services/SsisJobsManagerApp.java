package co.com.bnpparibas.cardif.services;

import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("rest")
public class SsisJobsManagerApp extends Application{
	
	
	private Set<Object> singletons = new HashSet<Object>();

	public SsisJobsManagerApp() {
		singletons.add(new SsisJobService());
		singletons.add(new NameService());
	}

	@Override
	public Set<Object> getSingletons() {
		return singletons;
	}
	

}
