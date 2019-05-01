package ibm.btp.gm.services;

import java.util.ArrayList;

import ibm.btp.gm.dao.HistoricoDAO;
import ibm.btp.gm.model.HistoricoModel;

public class HistoricoService {

	public ArrayList<HistoricoModel> listar() {

		return new HistoricoDAO().read();
	}

}
