package ibm.btp.gm.webService;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
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

}
