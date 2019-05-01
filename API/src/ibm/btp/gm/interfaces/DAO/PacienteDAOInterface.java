package ibm.btp.gm.interfaces.DAO;

import java.util.ArrayList;

import ibm.btp.gm.model.PacienteModel;

public interface PacienteDAOInterface {
	public boolean create(PacienteModel p);

	public ArrayList<PacienteModel> read();

	public boolean delete(PacienteModel p);

	public boolean update(PacienteModel p);

	public PacienteModel readById(int Id);
}
