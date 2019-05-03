package ibm.btp.gm.services;

import java.util.ArrayList;

import ibm.btp.gm.dao.HistoricoDAO;
import ibm.btp.gm.interfaces.services.HistoricoServiceInterface;
import ibm.btp.gm.model.HistoricoModel;

public class HistoricoService implements HistoricoServiceInterface{

	public ArrayList<HistoricoModel> read() {

		return new HistoricoDAO().read();
	}

	public boolean create(HistoricoModel historicoModel) {

		return new HistoricoDAO().create(historicoModel);

	}

	@Override
	public boolean delete(HistoricoModel  historicoModel) {
		
		return new HistoricoDAO().delete(historicoModel);
	}

	@Override
	public boolean update(HistoricoModel  historicoModel) {

		return new HistoricoDAO().update(historicoModel);
	}

	@Override
	public HistoricoModel readById(int id ) {
	
		return new HistoricoDAO().readById(id);

	}

}
