package ibm.btp.gm.services;

import java.util.ArrayList;

import ibm.btp.gm.dao.MedicamentosDAO;
import ibm.btp.gm.interfaces.services.MedicamentosServiceInterface;
import ibm.btp.gm.model.MedicamentosModel;

public class MedicamentoService implements MedicamentosServiceInterface{

	public ArrayList<MedicamentosModel> read() {
		return new MedicamentosDAO().read();
	}

}
