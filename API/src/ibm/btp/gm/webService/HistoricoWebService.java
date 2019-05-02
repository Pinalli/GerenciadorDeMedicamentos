package ibm.btp.gm.webService;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import ibm.btp.gm.interfaces.webServices.HistoricoWebServiceInterface;
import ibm.btp.gm.model.HistoricoModel;
import ibm.btp.gm.services.HistoricoService;

@Path("/historico")
public class HistoricoWebService implements HistoricoWebServiceInterface {

	@GET
	@Path("/read")
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<HistoricoModel> read() {

		return new HistoricoService().read();
	}

	@POST
	@Path("/create")
	@Consumes(MediaType.APPLICATION_JSON)
	public boolean create(HistoricoModel h) {
		return new HistoricoService().create(h);
	}
	@PUT
	@Path("/put")
	@Consumes(MediaType.APPLICATION_JSON)
	@Override
	public boolean update(HistoricoModel h) {
	
		return new HistoricoService().update(h);
	}
	@DELETE
	@Path("/delete")
	@Consumes(MediaType.APPLICATION_JSON)
	@Override
	public boolean delete(HistoricoModel h) {
		
		return new HistoricoService().delete(h);
	}
	@GET
	@Path("/read/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	@Override
	public HistoricoModel readById(@PathParam("id") int id) {
		
		return new HistoricoService().readById(id);
	}

}
