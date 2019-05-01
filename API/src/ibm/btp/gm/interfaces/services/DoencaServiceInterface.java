package ibm.btp.gm.interfaces.services;

import java.util.ArrayList;

import ibm.btp.gm.model.DoencaModel;

public interface DoencaServiceInterface {

	public ArrayList<DoencaModel> read();

	public boolean create(DoencaModel d);

	public boolean delete(DoencaModel d);

	public boolean update(DoencaModel d);

	public DoencaModel readById(int id);
}
