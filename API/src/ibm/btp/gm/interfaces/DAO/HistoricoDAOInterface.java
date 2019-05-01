package ibm.btp.gm.interfaces.DAO;

import java.util.ArrayList;

import ibm.btp.gm.model.HistoricoModel;

public interface HistoricoDAOInterface {
	public boolean create(HistoricoModel h);

	public ArrayList<HistoricoModel> read();

	public boolean delete(HistoricoModel h);

	public boolean update(HistoricoModel h);

	public HistoricoModel readById(int Id);
}
