package ibm.btp.gm.services;

import java.util.ArrayList;

import ibm.btp.gm.dao.MedicamentosDAO;
import ibm.btp.gm.model.MedicamentosModel;

public class MedicamentoService {
	
	public ArrayList<MedicamentosModel> listar() {
		return new MedicamentosDAO().ListaMedicamentos();
	}

}
