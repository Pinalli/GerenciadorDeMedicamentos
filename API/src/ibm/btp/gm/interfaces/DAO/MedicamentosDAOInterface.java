package ibm.btp.gm.interfaces.DAO;

import java.util.ArrayList;

import ibm.btp.gm.model.MedicamentosModel;

public interface MedicamentosDAOInterface {

	public boolean create(MedicamentosModel d);

	public ArrayList<MedicamentosModel> read();

	public boolean delete(MedicamentosModel d);

	public boolean update(MedicamentosModel d);

	public MedicamentosModel readById(int Id);
}
