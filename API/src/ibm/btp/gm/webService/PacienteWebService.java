package ibm.btp.gm.webService;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
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
}
