package ibm.btp.gm.interfaces.webServices;

import java.util.ArrayList;

import javax.ws.rs.PathParam;

import ibm.btp.gm.model.HistoricoModel;

public interface HistoricoWebServiceInterface {
	public ArrayList<HistoricoModel> read();
	public boolean create(HistoricoModel h);
	public boolean update(HistoricoModel h);
	public boolean delete(HistoricoModel h);
	public HistoricoModel readById(@PathParam("id") int id);
}
