package ibm.btp.gm.interfaces.DAO;

import java.util.ArrayList;

import ibm.btp.gm.model.DoencaModel;

public interface DoencaDAOInterface {

	public boolean create(DoencaModel h);

	public ArrayList<DoencaModel> read();

	public boolean delete(DoencaModel h);

	public boolean update(DoencaModel h);

	public DoencaModel readById(int Id);
}
