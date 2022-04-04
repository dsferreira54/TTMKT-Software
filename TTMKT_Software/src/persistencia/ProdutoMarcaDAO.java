package persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;

import negocio.Marca;
import negocio.ProdutoMarca;

public class ProdutoMarcaDAO {
	//PROPRIEDADES DA CLASSE
	private BancoDeDados objBanco = null;
	private PreparedStatement objExecucao = null;
	private ResultSet objCursor = null;
	
	//MÉTODO GET TODOS
	public Collection<Marca> getTodos() throws Exception {
		ArrayList<Marca> retorno = new ArrayList<Marca>();
		
		objBanco = new BancoDeDados();
		
		objBanco.conectar();
		
		objExecucao = objBanco.getObjConexao().prepareStatement("SELECT * FROM PRODUTO_MARCA");
		
		objCursor = objExecucao.executeQuery();
		
		while (objCursor.next()) {
			retorno.add(new Marca(objCursor.getString("CODIGO_PRODUTO_MARCA"),
								  objCursor.getString("CODIGO_PRODUTO"),
								  objCursor.getString("CNPJ_MARCA"),
								  objCursor.getString("MEDIDA")));
		}
		
		objBanco.desconectar();
		
		return retorno;
	}
	
	//MÉTODO INCLUIR
	public void persistir(ProdutoMarca objProdutoMarca) throws Exception {
		objBanco = new BancoDeDados();
		
		objBanco.conectar();
		
		objExecucao = objBanco.getObjConexao().prepareStatement("INSERT INTO PRODUTO_MARCA " +
																"(CODIGO_PRODUTO_MARCA, CODIGO_PRODUTO, CNPJ_MARCA, MEDIDA) " + 
																"VALUES" +
																"(?, ?, ?, ?)");
		
		objExecucao.setString(1, objProdutoMarca.getCodigoProdutoMarca());
		objExecucao.setString(2, objProdutoMarca.getCodigoDoProduto());
		objExecucao.setString(3, objProdutoMarca.getCnpjDaMarca());
		objExecucao.setString(4, objProdutoMarca.getMedida());
		
		objExecucao.executeUpdate();
		
		objBanco.desconectar();
	}
}
