package ibm.btp.gm.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import ibm.btp.gm.config.ConnectionFactory;
import ibm.btp.gm.interfaces.DAO.DoencaDAOInterface;
import ibm.btp.gm.model.DoencaModel;

public class DoencaDAO implements DoencaDAOInterface {

	@Override
	public boolean create(DoencaModel d) {
		try {
			Connection connection = ConnectionFactory.getConnection();
			String command = "INSERT INTO doencas(nome,descricao,agressividade) VALUES (?,?,?)";
			PreparedStatement statement = connection.prepareStatement(command);
			statement.setString(1, d.getNome());
			statement.setString(2, d.getDescricao());
			statement.setBoolean(3, d.isAgressividade());

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
	public ArrayList<DoencaModel> read() {
		Connection connection = ConnectionFactory.getConnection();
		String command = "SELECT * FROM doencas";
		try {
			PreparedStatement statement = connection.prepareStatement(command);
			ArrayList<DoencaModel> lista = new ArrayList<DoencaModel>();
			ResultSet result = statement.executeQuery();

			while (result.next()) {
				lista.add(new DoencaModel(result.getInt("id"), result.getString("nome"), result.getString("descricao"),
						result.getBoolean("agressividade")));
			}
			statement.close();
			connection.close();
			return lista;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean delete(DoencaModel d) {
		try {
			Connection connection = ConnectionFactory.getConnection();

			String command = "DELETE FROM doencas WHERE id=?";

			PreparedStatement statement = connection.prepareStatement(command);
			statement.setInt(1, d.getId());

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
	public boolean update(DoencaModel d) {

		try {
			Connection connection = ConnectionFactory.getConnection();

			String command = "UPDATE doencas " + "SET nome=?, descricao=?, agressividade=? " + "WHERE id=?";

			PreparedStatement statement = connection.prepareStatement(command);
			statement.setString(1, d.getNome());
			statement.setString(2, d.getDescricao());
			statement.setBoolean(3, d.isAgressividade());
			statement.setInt(4, d.getId());

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
	public DoencaModel readById(int Id) {
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

			return new DoencaModel(result.getInt("id"), result.getString("nome"), result.getString("descricao"),
					result.getBoolean("agressividade"));

		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

}
