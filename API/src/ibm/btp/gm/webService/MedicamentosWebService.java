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

import ibm.btp.gm.interfaces.webServices.MedicamentosWebServiceInterface;
import ibm.btp.gm.model.MedicamentosModel;
import ibm.btp.gm.services.MedicamentoService;

@Path("medicamentos")
public class MedicamentosWebService implements MedicamentosWebServiceInterface {

	@GET
	@Path("/read")
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<MedicamentosModel> read() {

		return new MedicamentoService().read();
	}

	@POST
	@Path("/post")
	@Consumes(MediaType.APPLICATION_JSON)
	@Override
	public boolean create(MedicamentosModel m) {

		return new MedicamentoService().create(m);
	}

	@PUT
	@Path("/put")
	@Consumes(MediaType.APPLICATION_JSON)
	@Override
	public boolean update(MedicamentosModel m) {

		return new MedicamentoService().update(m);
	}

	@DELETE
	@Path("/delete")
	@Consumes(MediaType.APPLICATION_JSON)
	@Override
	public boolean delete(MedicamentosModel m) {

		return new MedicamentoService().delete(m);
	}
	@GET
	@Path("/read/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	@Override
	public MedicamentosModel readById(@PathParam("id") int id) {

		return new MedicamentoService().readById(id);
	}
}
