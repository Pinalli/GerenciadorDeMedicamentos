package ibm.btp.gm.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import ibm.btp.gm.config.ConnectionFactory;
import ibm.btp.gm.model.DoencaModel;

public class DoencaDAO {
	
	public ArrayList<DoencaModel> listar(){
		Connection conexao = ConnectionFactory.getConnection();
		String sql = "SELECT * FROM doencas";
		try {
			PreparedStatement comando = conexao.prepareStatement(sql);
			ArrayList<DoencaModel> lista = new ArrayList<DoencaModel>(); 
			ResultSet resultado = comando.executeQuery();
			
			while(resultado.next()) {
				lista.add(new DoencaModel(resultado.getInt("id"),resultado.getString("nome"),resultado.getString("descricao"),resultado.getBoolean("agressividade")));
				
				
				
			}
			comando.close();
			conexao.close();
			return lista;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
	

}
