package ibm.btp.gm.services;

import java.util.ArrayList;

import ibm.btp.gm.dao.PacienteDAO;
import ibm.btp.gm.model.PacienteModel;

public class PacienteService {

	public ArrayList<PacienteModel> read() {

		return new PacienteDAO().read();
	}
}
