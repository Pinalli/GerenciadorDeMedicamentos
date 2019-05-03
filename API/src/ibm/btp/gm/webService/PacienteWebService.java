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

import ibm.btp.gm.interfaces.webServices.PacienteWebServiceInterface;
import ibm.btp.gm.model.PacienteModel;
import ibm.btp.gm.services.PacienteService;

@Path("/pacientes")
public class PacienteWebService implements PacienteWebServiceInterface{

	@GET
	@Path("/read")
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<PacienteModel> read() {

		return new PacienteService().read();
	}

	@POST
	@Path("/post")
	@Consumes(MediaType.APPLICATION_JSON)
	@Override
	public boolean create(PacienteModel p) {
		
		return new PacienteService().create(p);
	}


	@PUT
	@Path("/put")
	@Consumes(MediaType.APPLICATION_JSON)
	@Override
	public boolean update(PacienteModel p) {
		
		return new PacienteService().update(p);
	}

	@DELETE
	@Path("/delete")
	@Consumes(MediaType.APPLICATION_JSON)
	@Override
	public boolean delete(PacienteModel p) {
		
		return new PacienteService().delete(p);
	}

	@GET
	@Path("/read/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	@Override
	public PacienteModel readById(@PathParam("id") int id) {
		
		return new PacienteService().readById(id);
	}
}
