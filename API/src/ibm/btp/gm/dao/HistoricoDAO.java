package ibm.btp.gm.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import ibm.btp.gm.config.ConnectionFactory;
import ibm.btp.gm.model.HistoricoModel;

import org.apache.commons.dbutils.DbUtils;

public class HistoricoDAO {

	public ArrayList<HistoricoModel> ListarHistorico() {
		ArrayList<HistoricoModel> lHistorico = new ArrayList<>();
		Connection conexao = null;
		PreparedStatement statement = null;
		ResultSet result = null;

		try {
			conexao = ConnectionFactory.getConnection();

			String sql = "SELECT * FROM HISTORICO";
			statement = conexao.prepareStatement(sql);
			result = statement.executeQuery();

			while (result.next()) {
				HistoricoModel historico = new HistoricoModel();
				historico.setId(result.getInt("id"));
				historico.setIdDoenca(result.getInt("idDoenca"));
				historico.setIdMedicamento(result.getInt("idMedicamento"));
				historico.setIdPaciente(result.getInt("idPaciente"));
				historico.setDataHora(result.getTimestamp("dataHora"));

				lHistorico.add(historico);
			}

		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println("SQL ERRO");
		} finally {
			DbUtils.closeQuietly(statement);
			DbUtils.closeQuietly(result);
			DbUtils.closeQuietly(conexao);
		}

		return lHistorico;
	}

	public Integer Incluir(HistoricoModel historicoModel) {
		Connection conexao = null;
		PreparedStatement statement = null;

		try {
			conexao = ConnectionFactory.getConnection();

			String sql = "INSERT INTO HISTORICO (IDMEDICAMENTO, DATAHORA, IDPACIENTE, IDDOENCA) VALUES (?,?,?,?)";

			statement = conexao.prepareStatement(sql);
			statement.setInt(1, historicoModel.getIdMedicamento());
			statement.setTimestamp(2, this.getCurrentTimeStamp());
			statement.setInt(3, historicoModel.getIdPaciente());
			statement.setInt(4, historicoModel.getIdDoenca());

			statement.executeUpdate();

		} catch (SQLException ex) {
			System.out.println("SQL ERROR");
		} finally {
			DbUtils.closeQuietly(statement);
			DbUtils.closeQuietly(conexao);
		}

		return 1;
	}

	private java.sql.Timestamp getCurrentTimeStamp() {

		java.util.Date today = new java.util.Date();
		return new java.sql.Timestamp(today.getTime());

	}

}
