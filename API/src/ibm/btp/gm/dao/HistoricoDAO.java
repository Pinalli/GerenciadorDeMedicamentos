package ibm.btp.gm.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import ibm.btp.gm.config.ConnectionFactory;
import ibm.btp.gm.interfaces.DAO.HistoricoDAOInterface;
import ibm.btp.gm.model.HistoricoModel;

public class HistoricoDAO implements HistoricoDAOInterface {

	@Override
	public boolean create(HistoricoModel h) {
		try {
			Connection connection = ConnectionFactory.getConnection();
			String command = "INSERT INTO historico(idmedicamento,datahora,idpaciente, iddoenca) VALUES (?,CURRENT_TIMESTAMP,?,?)";
			PreparedStatement statement = connection.prepareStatement(command);
			statement.setInt(1, h.getIdMedicamento());
			statement.setInt(2, h.getIdPaciente());
			statement.setInt(3, h.getIdDoenca());

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
	public ArrayList<HistoricoModel> read() {
		ArrayList<HistoricoModel> lHistorico = new ArrayList<>();

		try {
			Connection conexao = ConnectionFactory.getConnection();

			String sql = "SELECT * FROM HISTORICO";
			PreparedStatement statement = conexao.prepareStatement(sql);
			ResultSet result = statement.executeQuery();

			while (result.next()) {

				HistoricoModel historico = new HistoricoModel();
				historico.setId(result.getInt("id"));
				historico.setIdDoenca(result.getInt("idDoenca"));
				historico.setIdMedicamento(result.getInt("idMedicamento"));
				historico.setIdPaciente(result.getInt("idPaciente"));
				historico.setDataHora(result.getTimestamp("dataHora"));

				lHistorico.add(historico);

			}

			statement.close();
			conexao.close();

			return lHistorico;

		} catch (SQLException e) {
			System.out.println("SQL ERRO");
			return null;
		}
	}

	@Override
	public boolean delete(HistoricoModel h) {
		try {
			Connection connection = ConnectionFactory.getConnection();
			String command = "DELETE FROM historico WHERE id=?";
			PreparedStatement statement = connection.prepareStatement(command);
			statement.setInt(1, h.getId());

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
	public boolean update(HistoricoModel h) {
		try {
			Connection connection = ConnectionFactory.getConnection();

			String command = "UPDATE historico " + "SET idmedicamento=?, datahora=?, idpaciente=?, iddoenca=?"
					+ "WHERE id=?";

			PreparedStatement statement = connection.prepareStatement(command);
			statement.setInt(1, h.getIdMedicamento());
			statement.setTimestamp(2, h.getDataHora());
			statement.setInt(3, h.getIdPaciente());
			statement.setInt(4, h.getIdDoenca());
			statement.setInt(5, h.getId());

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
	public HistoricoModel readById(int Id) {
		Connection connection = ConnectionFactory.getConnection();
		String sql = "SELECT * FROM historico WHERE id=?";
		try {
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setInt(1, Id);

			ResultSet result = statement.executeQuery();

			statement.close();
			connection.close();

			if (result == null) {
				throw new SQLException("Historico not found");
			}

			return new HistoricoModel(result.getInt("id"), result.getInt("idmedicamento"), result.getInt("iddoenca"),
					result.getInt("idpaciente"), result.getTimestamp("datahora"));

		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

}
