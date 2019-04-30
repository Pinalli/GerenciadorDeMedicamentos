package ibm.btp.gm.dao;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import ibm.btp.gm.config.ConnectionFactory;
import ibm.btp.gm.model.HistoricoModel;

public class HistoricoDAO {
	
	public ArrayList<HistoricoModel> ListarHistorico(){
		ArrayList<HistoricoModel> lHistorico = new ArrayList<>();
		
		try {
			Connection conexao = ConnectionFactory.getConnection();
			
			String sql = "SELECT * FROM HISTORICO";
			PreparedStatement statement = conexao.prepareStatement(sql);
			ResultSet result = statement.executeQuery();
			
			while(result.next()) {
				HistoricoModel historico = new HistoricoModel();
				historico.setId(result.getInt("id"));
				historico.setIdDoenca(result.getInt("idDoenca"));
				historico.setIdMedicamento(result.getInt("idMedicamento"));
				historico.setIdPaciente(result.getInt("idPaciente"));
				historico.setData(result.getTimestamp("dataHora"));
				
				lHistorico.add(historico);
				
			}
			
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println("SQL ERRO");
		}
		
		return lHistorico;
	}

}
