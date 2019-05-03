package ibm.btp.gm.webService;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import ibm.btp.gm.model.HistoricoModel;
import ibm.btp.gm.services.HistoricoService;

@Path("/historico")
public class HistoricoWebService {

	@GET
	@Path("/list")
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<HistoricoModel> listarHistorico() {

		return new HistoricoService().listar();
	}

	@POST
	@Path("/add")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public boolean incluirHistorico(HistoricoModel  historicoModel) {
		//Gson gson = new GsonBuilder().create();
	//	HistoricoModel historicoModel = gson.fromJson(sHistoricoModel, HistoricoModel.class);
		
	//	System.out.println("teste teste " + historicoModel.getIdPaciente() +  sHistoricoModel);
		return new HistoricoService().incluir(historicoModel);
	}

}
