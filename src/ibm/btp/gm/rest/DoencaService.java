package ibm.btp.gm.rest;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

import ibm.btp.gm.dao.DoencaDAO;
import ibm.btp.gm.model.DoencaModel;

@Path("/doencas")  //Path como uma pasta
public class DoencaService {
	@Context
	private UriInfo context;
	
	public DoencaService() {
		
	}
	
	@GET
	@Path("/list")
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<DoencaModel> listarDoencas(){
		return new DoencaDAO().listar();
	}
	
	

}
