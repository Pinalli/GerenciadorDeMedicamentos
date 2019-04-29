package ibm.btp.gm.webService;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

import ibm.btp.gm.model.DoencaModel;
import ibm.btp.gm.services.DoencaService;

@Path("/doencas")  //Path como uma pasta
public class DoencaWebService {
	@Context
	private UriInfo context;
	
	public DoencaWebService() {
		
	}
	
	@GET
	@Path("/list")
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<DoencaModel> listarDoencas(){
		return new DoencaService().listar();
	}
	
	

}
