package ibm.btp.gm.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import ibm.btp.gm.config.ConnectionFactory;
import ibm.btp.gm.model.MedicamentosModel;

public class MedicamentosDAO {

	public List<MedicamentosModel> ListaMedicamentos() throws Exception {
		List<MedicamentosModel> lMedicamentos = new ArrayList<>();
		
		try {
		Connection conexao = ConnectionFactory.getConnection();
		
		String sql = "SELECT * FROM MEDICAMENTOS";
		
		PreparedStatement statement = conexao.prepareStatement(sql);
		ResultSet result = statement.executeQuery();
		
		while(result.next()) {
			MedicamentosModel medicamento = new MedicamentosModel();
			medicamento.setId(result.getInt("id"));
			medicamento.setIndicacao(result.getString("indicacao"));
			medicamento.setManha(result.getBoolean("manha"));
			medicamento.setNoite(result.getBoolean("noite"));
			medicamento.setTarde(result.getBoolean("tarde"));
			medicamento.setNome(result.getString("nome"));
			lMedicamentos.add(medicamento);
		}
		
		}catch(Exception ex) {
			Logger.getLogger(MedicamentosDAO.class.getName()).log(Level.SEVERE, null, ex);

			System.out.println(ex);
		}
		
		return lMedicamentos;
		
	}
}
