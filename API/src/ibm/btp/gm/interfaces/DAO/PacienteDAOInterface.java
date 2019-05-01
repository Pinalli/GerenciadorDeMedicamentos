package ibm.btp.gm.interfaces.DAO;

import java.util.ArrayList;

import ibm.btp.gm.model.PacienteModel;

public interface PacienteDAOInterface {
	public boolean create(PacienteModel d);

	public ArrayList<PacienteModel> read();

	public boolean delete(PacienteModel d);

	public boolean update(PacienteModel d);

	public PacienteModel readById(int Id);
}
