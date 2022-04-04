package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;

public class BancoDeDados {
	//PROPRIEDADES DA CLASSE
	private Connection objConexao = null;
	
	//MÉTODO GET DA CLASSE
	public Connection getObjConexao() {
		return objConexao;
	}
	
	//MÉTODO PARA CONECTAR NO BANCO
	public void conectar() throws Exception {
		objConexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/ttmktdatabase?"
															+ "serverTimezone=UTC&"
															+ "user=root&"
															+ "password=123456&"
															+ "useSSL=false");
	}
	
	public void desconectar() throws Exception {
		objConexao.close();
	}
}
