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

import ibm.btp.gm.interfaces.webServices.DoencaWebServiceInterface;
import ibm.btp.gm.model.DoencaModel;
import ibm.btp.gm.services.DoencaService;

@Path("/doenca")
public class DoencaWebService implements DoencaWebServiceInterface {

	public DoencaWebService() {

	}

	@Override
	@GET
	@Path("/read")
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<DoencaModel> read() {
		return new DoencaService().read();
	}

	@Override
	@POST
	@Path("/post")
	@Consumes(MediaType.APPLICATION_JSON)
	public boolean create(DoencaModel d) {
		return new DoencaService().create(d);
	}

	@Override
	@PUT
	@Path("/put")
	@Consumes(MediaType.APPLICATION_JSON)
	public boolean update(DoencaModel d) {
		return new DoencaService().update(d);
	}

	@Override
	@DELETE
	@Path("/delete/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	public boolean delete(@PathParam("id") Integer id) {
		return new DoencaService().delete(id);
	}

	@Override
	@GET
	@Path("/read/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public DoencaModel readById(@PathParam("id") int id) {
		return new DoencaService().readById(id);
	}

}
