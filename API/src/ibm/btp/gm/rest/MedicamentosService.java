package ibm.btp.gm.rest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import ibm.btp.gm.dao.MedicamentosDAO;
import ibm.btp.gm.model.MedicamentosModel;

@Path("medicamentos")
public class MedicamentosService {

	@GET
	@Path("list") 
	@Produces(MediaType.APPLICATION_JSON)
	public List<MedicamentosModel> listarMedicamentos() throws Exception {

		MedicamentosDAO daoMedicamentos = new MedicamentosDAO();

		return daoMedicamentos.ListaMedicamentos();
	}
}
