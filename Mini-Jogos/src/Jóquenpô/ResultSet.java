package Jóquenpô;

import java.sql.PreparedStatement;

public class ResultSet {

	public ResultSet selecionaDados() {
		ResultSet dados = null;
		String sql = "SELCT * FROM tabela";
		PreparedStatement stmt = conexao.getConexao.prepareStatement(sql);
		try {
			stmt.setString(1, stmt.getLogin());
			stmt.setString(2, stmt.getSenha());
			ResultSet rs = stmt.executeQuery();
			stmt.execute();
			stmt.close();
		}
		return dados;
	}
		selectionaDados();
		btnBotao.setText(dados("coluna"));
		
		if(dados.next()) {
			
		
		
		
		
	}
	
}
