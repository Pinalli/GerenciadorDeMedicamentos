package ibm.btp.gm.interfaces.DAO;

import java.util.ArrayList;

import ibm.btp.gm.model.HistoricoModel;

public interface HistoricoDAOInterface {
	public boolean create(HistoricoModel d);

	public ArrayList<HistoricoModel> read();

	public boolean delete(HistoricoModel d);

	public boolean update(HistoricoModel d);

	public HistoricoModel readById(int Id);
}
