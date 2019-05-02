package ibm.btp.gm.webService;

import java.util.ArrayList;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import ibm.btp.gm.model.MedicamentosModel;
import ibm.btp.gm.services.MedicamentoService;

@Path("medicamentos")
public class MedicamentosWebService {

	@GET
	@Path("list") 
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<MedicamentosModel> listarMedicamentos() {

		return new MedicamentoService().read();
	}
}
