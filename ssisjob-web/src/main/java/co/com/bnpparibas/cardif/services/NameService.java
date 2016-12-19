package co.com.bnpparibas.cardif.services;

import javax.ejb.*;
import javax.ws.rs.*;
import co.com.bnpparibas.cardif.ejbs.NameBean;

@Path("/name")
@Stateless
public class NameService {    

	@EJB    
	private NameBean nameBean;    

	@GET
	@Produces("text/html")    
	public String getHtml() {        
		return "<h2>Hello "+nameBean.getName()+"</h2>";    
	}    

	@PUT    
	@Consumes("text/plain")    
	public void put(String content) {        
		nameBean.setName(content);
	}
}