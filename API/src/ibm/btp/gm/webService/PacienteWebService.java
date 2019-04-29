package ibm.btp.gm.webService;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import ibm.btp.gm.model.PacienteModel;
import ibm.btp.gm.services.PacienteService;

@Path("/paciente")
public class PacienteWebService {

	@GET
	@Path("/list")
	@Produces(MediaType.APPLICATION_JSON)
	public List<PacienteModel> listarPacientes() {
		
		return new PacienteService().listar();
	}
}
