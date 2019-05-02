package ibm.btp.gm.services;

import java.util.ArrayList;

import ibm.btp.gm.dao.MedicamentosDAO;
import ibm.btp.gm.interfaces.services.MedicamentosServiceInterface;
import ibm.btp.gm.model.MedicamentosModel;

public class MedicamentoService implements MedicamentosServiceInterface{

	public ArrayList<MedicamentosModel> read() {
		return new MedicamentosDAO().read();
	}

	@Override
	public boolean create(MedicamentosModel m) {

		return new MedicamentosDAO().create(m);
	}

	@Override
	public boolean delete(MedicamentosModel m) {
		
		return new MedicamentosDAO().delete(m);
	}

	@Override
	public boolean update(MedicamentosModel m) {
		
		return new MedicamentosDAO().update(m);
	}

	@Override
	public MedicamentosModel readById(int id) {
		
		return new MedicamentosDAO().readById(id);
	}

}
