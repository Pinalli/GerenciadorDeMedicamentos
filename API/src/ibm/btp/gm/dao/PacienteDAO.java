package ibm.btp.gm.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import ibm.btp.gm.config.ConnectionFactory;
import ibm.btp.gm.interfaces.DAO.PacienteDAOInterface;
import ibm.btp.gm.model.PacienteModel;

public class PacienteDAO implements PacienteDAOInterface {

	@Override
	public ArrayList<PacienteModel> read() {

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

	@Override
	public boolean create(PacienteModel p) {
		try {
			Connection connection = ConnectionFactory.getConnection();
			String command = "INSERT INTO pacientes(nome,genero,doenca_1,medicamento_1,doenca_2,medicamento_2,doenca_3,medicamento_3) VALUES (?,?,?,?,?,?,?,?)";
			PreparedStatement statement = connection.prepareStatement(command);
			statement.setString(1, p.getNome());
			statement.setString(2, p.getGenero());
			statement.setInt(3, p.getDoenca_1());
			statement.setInt(4, p.getMedicamento_1());
			statement.setInt(5, p.getDoenca_2());
			statement.setInt(6, p.getMedicamento_2());
			statement.setInt(7, p.getDoenca_3());
			statement.setInt(8, p.getMedicamento_3());

			statement.executeUpdate();

			statement.close();
			connection.close();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean delete(PacienteModel p) {
		try {
			Connection connection = ConnectionFactory.getConnection();

			String command = "DELETE FROM pacientes WHERE id=?";

			PreparedStatement statement = connection.prepareStatement(command);
			statement.setInt(1, p.getId());

			statement.executeUpdate();

			statement.close();
			connection.close();
			return true;

		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean update(PacienteModel p) {
		try {
			Connection connection = ConnectionFactory.getConnection();

			String command = "UPDATE pacientes "
					+ "SET nome=?, genero=?, doenca_1=?, doenca_1=?, medicamento_1=?, medicamento_2=?, doenca_3=?, medicamento_3=? "
					+ "WHERE id=?";

			PreparedStatement statement = connection.prepareStatement(command);
			statement.setString(1, p.getNome());
			statement.setString(2, p.getGenero());
			statement.setInt(3, p.getDoenca_1());
			statement.setInt(4, p.getMedicamento_1());
			statement.setInt(5, p.getDoenca_2());
			statement.setInt(6, p.getMedicamento_2());
			statement.setInt(7, p.getDoenca_3());
			statement.setInt(8, p.getMedicamento_3());
			statement.setInt(9, p.getId());

			statement.executeUpdate();

			statement.close();
			connection.close();
			return true;

		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public PacienteModel readById(int Id) {

		Connection connection = ConnectionFactory.getConnection();
		String sql = "SELECT * FROM pacientes WHERE id=?";
		try {
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setInt(1, Id);

			ResultSet result = statement.executeQuery();

			PacienteModel paciente = new PacienteModel();
			if(!result.next()) {
				return null;
			}
			paciente.setId(result.getInt("id"));
			paciente.setNome(result.getString("nome"));
			paciente.setGenero(result.getString("genero"));
			paciente.setDoenca_1(result.getInt("doenca_1"));
			paciente.setDoenca_2(result.getInt("doenca_2"));
			paciente.setDoenca_3(result.getInt("doenca_3"));
			paciente.setMedicamento_1(result.getInt("medicamento_1"));
			paciente.setMedicamento_2(result.getInt("medicamento_2"));
			paciente.setMedicamento_3(result.getInt("medicamento_3"));
			statement.close();
			connection.close();

			return paciente;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

}
