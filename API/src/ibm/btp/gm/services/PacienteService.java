package ibm.btp.gm.services;

import java.util.ArrayList;

import ibm.btp.gm.dao.PacienteDAO;
import ibm.btp.gm.interfaces.services.PacienteServiceInterface;
import ibm.btp.gm.model.PacienteModel;

public class PacienteService implements PacienteServiceInterface {

	public ArrayList<PacienteModel> read() {

		return new PacienteDAO().read();
	}

	@Override
	public boolean create(PacienteModel p) {
		
		return new PacienteDAO().create(p);
	}

	@Override
	public boolean delete(PacienteModel p) {
		
		return new PacienteDAO().delete(p);
	}

	@Override
	public boolean update(PacienteModel p) {
		
		return new PacienteDAO().update(p);
	}

	@Override
	public PacienteModel readById(int id) {
		
		return new PacienteDAO().readById(id);
	}
}
