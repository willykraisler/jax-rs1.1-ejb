package co.com.bnpparibas.cardif.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;



@Path("/SsisJobService")
public class SsisJobService{
	
	@GET
	@Path("/ping")
	@Produces({"application/json"})
	public String getPermissions() {		
		return "Ping";
	}	
	

}
