package ibm.btp.gm.interfaces.services;

import java.util.ArrayList;

import ibm.btp.gm.model.PacienteModel;

public interface PacienteServiceInterface {
	public ArrayList<PacienteModel> read();

	public boolean create(PacienteModel p);

	public boolean delete(PacienteModel p);

	public boolean update(PacienteModel p);

	public PacienteModel readById(int id);
}
