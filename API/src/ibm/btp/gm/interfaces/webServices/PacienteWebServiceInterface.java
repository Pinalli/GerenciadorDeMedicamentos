package ibm.btp.gm.interfaces.webServices;

import java.util.ArrayList;

import javax.ws.rs.PathParam;

import ibm.btp.gm.model.PacienteModel;

public interface PacienteWebServiceInterface {
	public ArrayList<PacienteModel> read();
	public boolean create(PacienteModel p);
	public boolean update(PacienteModel p);
	public boolean delete(PacienteModel p);
	public PacienteModel readById(@PathParam("id") int id);
}
