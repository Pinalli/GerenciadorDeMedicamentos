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
	public boolean delete(HistoricoModel h) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(HistoricoModel h) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public HistoricoModel readById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
