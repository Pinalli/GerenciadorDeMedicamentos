package ibm.btp.gm.interfaces.DAO;

import java.util.ArrayList;

import ibm.btp.gm.model.DoencaModel;

public interface DoencaDAOInterface {

	public boolean create(DoencaModel d);

	public ArrayList<DoencaModel> read();

	public boolean delete(Integer d);

	public boolean update(DoencaModel d);

	public DoencaModel readById(int Id);
}
