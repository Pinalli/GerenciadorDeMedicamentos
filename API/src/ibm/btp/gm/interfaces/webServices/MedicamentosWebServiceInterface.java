package ibm.btp.gm.interfaces.webServices;

import java.util.ArrayList;

import javax.ws.rs.PathParam;

import ibm.btp.gm.model.MedicamentosModel;

public interface MedicamentosWebServiceInterface {
	public ArrayList<MedicamentosModel> read();
	public boolean create(MedicamentosModel m);
	public boolean update(MedicamentosModel m);
	public boolean delete(MedicamentosModel m);
	public MedicamentosModel readById(@PathParam("id") int id);
}
