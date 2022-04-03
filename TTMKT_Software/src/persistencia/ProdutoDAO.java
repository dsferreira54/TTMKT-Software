package persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;

import negocio.Produto;

public class ProdutoDAO {
	//PROPRIEDADES DA CLASSE
	private BancoDeDados objBanco = null;
	private PreparedStatement objExecucao = null;
	private ResultSet objCursor = null;
	
	//MÉTODO GET TODOS
	public Collection<Produto> getTodos() throws Exception {
		ArrayList<Produto> retorno = new ArrayList<Produto>();
		
		objBanco = new BancoDeDados();
		
		objBanco.conectar();
		
		objExecucao = objBanco.getObjConexao().prepareStatement("SELECT * FROM PRODUTO");
		
		objCursor = objExecucao.executeQuery();
		
		while (objCursor.next()) {
			retorno.add(new Produto(objCursor.getString("CODIGO_PRODUTO"),
								  	objCursor.getString("NOME")));
		}
		
		objBanco.desconectar();
		
		return retorno;
	}
	
	//MÉTODO INCLUIR
	public void persistir(Produto objProduto) throws Exception {
		objBanco = new BancoDeDados();
		
		objBanco.conectar();
		
		objExecucao = objBanco.getObjConexao().prepareStatement("INSERT INTO PRODUTO" +
																"(CODIGO_PRODUTO, NOME) " + 
																"VALUES" +
																"(?, ?)");
		
		objExecucao.setString(1, objProduto.getCodigoDoProduto());
		objExecucao.setString(2, objProduto.getNome());
		
		objExecucao.executeUpdate();
		
		objBanco.desconectar();
	}
}
