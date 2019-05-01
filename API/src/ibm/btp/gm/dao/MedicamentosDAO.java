package ibm.btp.gm.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import ibm.btp.gm.config.ConnectionFactory;
import ibm.btp.gm.interfaces.DAO.MedicamentosDAOInterface;
import ibm.btp.gm.model.MedicamentosModel;

public class MedicamentosDAO implements MedicamentosDAOInterface {

	@Override
	public ArrayList<MedicamentosModel> read() {
		ArrayList<MedicamentosModel> lMedicamentos = new ArrayList<>();

		try {
			Connection conexao = ConnectionFactory.getConnection();

			String sql = "SELECT * FROM medicamentos";

			PreparedStatement statement = conexao.prepareStatement(sql);
			ResultSet result = statement.executeQuery();

			while (result.next()) {
				MedicamentosModel medicamento = new MedicamentosModel();
				medicamento.setId(result.getInt("id"));
				medicamento.setIndicacao(result.getString("indicacao"));
				medicamento.setManha(result.getBoolean("manha"));
				medicamento.setNoite(result.getBoolean("noite"));
				medicamento.setTarde(result.getBoolean("tarde"));
				medicamento.setNome(result.getString("nome"));
				lMedicamentos.add(medicamento);
			}

		} catch (Exception ex) {
			Logger.getLogger(MedicamentosDAO.class.getName()).log(Level.SEVERE, null, ex);

			System.out.println(ex);
		}

		return lMedicamentos;

	}

	@Override
	public boolean create(MedicamentosModel m) {
		try {
			Connection connection = ConnectionFactory.getConnection();
			String command = "INSERT INTO medicamentos(nome,indicacao,manha,tarde,noite) VALUES (?,?,?,?,?)";
			PreparedStatement statement = connection.prepareStatement(command);
			statement.setString(1, m.getNome());
			statement.setString(2, m.getIndicacao());
			statement.setBoolean(3, m.isManha());
			statement.setBoolean(4, m.isTarde());
			statement.setBoolean(5, m.isNoite());

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
	public boolean delete(MedicamentosModel m) {
		try {
			Connection connection = ConnectionFactory.getConnection();

			String command = "DELETE FROM medicamentos WHERE id=?";

			PreparedStatement statement = connection.prepareStatement(command);
			statement.setInt(1, m.getId());

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
	public boolean update(MedicamentosModel m) {
		try {
			Connection connection = ConnectionFactory.getConnection();

			String command = "UPDATE medicamentos " + "SET nome=?, indicacao=?, manha=?, tarde=?, noite=? "
					+ "WHERE id=?";

			PreparedStatement statement = connection.prepareStatement(command);
			statement.setString(1, m.getNome());
			statement.setString(2, m.getIndicacao());
			statement.setBoolean(3, m.isManha());
			statement.setBoolean(4, m.isTarde());
			statement.setBoolean(5, m.isNoite());
			statement.setInt(6, m.getId());

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
	public MedicamentosModel readById(int Id) {
		Connection connection = ConnectionFactory.getConnection();
		String sql = "SELECT * FROM doencas WHERE id=?";
		try {
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setInt(1, Id);

			ResultSet result = statement.executeQuery();

			statement.close();
			connection.close();

			if (result == null) {
				throw new SQLException("Doenca not found");
			}

			return new MedicamentosModel(result.getInt("id"), result.getString("nome"), result.getString("indicacao"),
					result.getBoolean("manha"), result.getBoolean("tarde"), result.getBoolean("noite"));

		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
}
