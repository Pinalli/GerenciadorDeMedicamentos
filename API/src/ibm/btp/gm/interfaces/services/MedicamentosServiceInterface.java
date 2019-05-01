package ibm.btp.gm.interfaces.services;

import java.util.ArrayList;

import ibm.btp.gm.model.MedicamentosModel;

public interface MedicamentosServiceInterface {
	public ArrayList<MedicamentosModel> read();

	public boolean create(MedicamentosModel d);

	public boolean delete(MedicamentosModel d);

	public boolean update(MedicamentosModel d);

	public MedicamentosModel readById(int id);
}
