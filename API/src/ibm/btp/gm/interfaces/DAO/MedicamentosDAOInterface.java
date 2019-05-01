package ibm.btp.gm.interfaces.DAO;

import java.util.ArrayList;

import ibm.btp.gm.model.MedicamentosModel;

public interface MedicamentosDAOInterface {

	public boolean create(MedicamentosModel m);

	public ArrayList<MedicamentosModel> read();

	public boolean delete(MedicamentosModel m);

	public boolean update(MedicamentosModel m);

	public MedicamentosModel readById(int Id);
}
