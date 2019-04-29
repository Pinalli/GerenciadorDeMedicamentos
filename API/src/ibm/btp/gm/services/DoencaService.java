package ibm.btp.gm.services;

import java.util.ArrayList;

import ibm.btp.gm.dao.DoencaDAO;
import ibm.btp.gm.model.DoencaModel;

public class DoencaService {

	public ArrayList<DoencaModel> listar(){
		return new DoencaDAO().listar();
	}
}