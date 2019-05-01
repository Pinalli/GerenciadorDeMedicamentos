package ibm.btp.gm.services;

import java.util.ArrayList;

import ibm.btp.gm.dao.DoencaDAO;
import ibm.btp.gm.interfaces.services.DoencaServiceInterface;
import ibm.btp.gm.model.DoencaModel;

public class DoencaService implements DoencaServiceInterface {

	@Override
	public ArrayList<DoencaModel> read() {
		return new DoencaDAO().read();
	}

	@Override
	public boolean create(DoencaModel d) {
		return new DoencaDAO().create(d);
	}

	@Override
	public boolean delete(DoencaModel d) {
		return new DoencaDAO().delete(d);
	}

	@Override
	public boolean update(DoencaModel d) {
		return new DoencaDAO().update(d);
	}

	@Override
	public DoencaModel readById(int id) {
		return new DoencaDAO().readById(id);
	}
}