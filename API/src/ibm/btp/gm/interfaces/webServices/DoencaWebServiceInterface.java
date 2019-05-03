package ibm.btp.gm.interfaces.webServices;

import java.util.ArrayList;

import javax.ws.rs.PathParam;

import ibm.btp.gm.model.DoencaModel;

public interface DoencaWebServiceInterface {
	public ArrayList<DoencaModel> read();

	public boolean create(DoencaModel d);

	public boolean update(DoencaModel d);

	public boolean delete(Integer d);

	public DoencaModel readById(@PathParam("id") int id);

}
