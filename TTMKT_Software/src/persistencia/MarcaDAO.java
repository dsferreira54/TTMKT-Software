package persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;

import negocio.Marca;

public class MarcaDAO {
	//PROPRIEDADES DA CLASSE
	private BancoDeDados objBanco = null;
	private PreparedStatement objExecucao = null;
	private ResultSet objCursor = null;
	
	//MÉTODO GET TODOS
	public Collection<Marca> getTodos() throws Exception {
		ArrayList<Marca> retorno = new ArrayList<Marca>();
		
		objBanco = new BancoDeDados();
		
		objBanco.conectar();
		
		objExecucao = objBanco.getObjConexao().prepareStatement("SELECT * FROM MARCA");
		
		objCursor = objExecucao.executeQuery();
		
		while (objCursor.next()) {
			retorno.add(new Marca(objCursor.getString("CNPJ_MARCA"),
								  objCursor.getString("TELEFONE"),
								  objCursor.getString("EMAIL"),
								  objCursor.getString("NOME")));
		}
		
		objBanco.desconectar();
		
		return retorno;
	}
	
	//MÉTODO INCLUIR
	public void persistir(Marca objMarca) throws Exception {
		objBanco = new BancoDeDados();
		
		objBanco.conectar();
		
		objExecucao = objBanco.getObjConexao().prepareStatement("INSERT INTO MARCA " +
																"(CNPJ_MARCA, TELEFONE, EMAIL, NOME) " + 
																"VALUES" +
																"(?, ?, ?, ?)");
		
		objExecucao.setString(1, objMarca.getCnpjDaMarca());
		objExecucao.setString(2, objMarca.getTelefone());
		objExecucao.setString(3, objMarca.getEmail());
		objExecucao.setString(4, objMarca.getNome());
		
		objExecucao.executeUpdate();
		
		objBanco.desconectar();
	}
}
