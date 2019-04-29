package ibm.btp.gm.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import ibm.btp.gm.config.ConnectionFactory;

import ibm.btp.gm.model.PacienteModel;

public class PacienteDAO {

	public ArrayList<PacienteModel> listar() {

		ArrayList<PacienteModel> pacientes = new ArrayList<>();

		try {
			Connection conexao = ConnectionFactory.getConnection();

			String sql = "SELECT * FROM pacientes";

			PreparedStatement statement = conexao.prepareStatement(sql);
			ResultSet result = statement.executeQuery();

			while (result.next()) {
				PacienteModel paciente = new PacienteModel();
				paciente.setId(result.getInt("id"));
				paciente.setNome(result.getString("nome"));
				paciente.setGenero(result.getString("genero"));
				paciente.setDoenca_1(result.getInt("doenca_1"));
				paciente.setDoenca_2(result.getInt("doenca_2"));
				paciente.setDoenca_3(result.getInt("doenca_3"));
				paciente.setMedicamento_1(result.getInt("medicamento_1"));
				paciente.setMedicamento_2(result.getInt("medicamento_2"));
				paciente.setMedicamento_3(result.getInt("medicamento_3"));
				pacientes.add(paciente);
			}

		} catch (Exception ex) {
			Logger.getLogger(MedicamentosDAO.class.getName()).log(Level.SEVERE, null, ex);

			System.out.println(ex);
		}

		return pacientes;

	}

}
