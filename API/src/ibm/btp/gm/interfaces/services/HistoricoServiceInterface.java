package ibm.btp.gm.interfaces.services;

import java.util.ArrayList;

import ibm.btp.gm.model.HistoricoModel;

public interface HistoricoServiceInterface {
	public ArrayList<HistoricoModel> read();

	public boolean create(HistoricoModel h);

	public boolean delete(HistoricoModel h);

	public boolean update(HistoricoModel h);

	public HistoricoModel readById(int id);
}
