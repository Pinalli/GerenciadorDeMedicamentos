package ibm.btp.gm.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import ibm.btp.gm.model.PacienteModel;

@Path("/paciente")
public class PacienteService {

	@GET
	@Path("/list")
	@Produces(MediaType.APPLICATION_JSON)
	public List<PacienteModel> listarPacientes() {
		List<PacienteModel> lista = new ArrayList<PacienteModel>();
		try {
			PacienteModel p = new PacienteModel();
			p.setAla("FEMININO");
			p.setId(1);
			p.setNome("Jorge");
			lista.add(p);
			// lista =
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return lista;
	}
}
