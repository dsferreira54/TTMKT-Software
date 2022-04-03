package persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;

import negocio.Supermercado;

public class SupermercadoDAO {
	//PROPRIEDADES DA CLASSE
	private BancoDeDados objBanco = null;
	private PreparedStatement objExecucao = null;
	private ResultSet objCursor = null;
	
	//MÉTODO GET TODOS
	public Collection<Supermercado> getTodos() throws Exception {
		ArrayList<Supermercado> retorno = new ArrayList<Supermercado>();
		
		objBanco = new BancoDeDados();
		
		objBanco.conectar();
		
		objExecucao = objBanco.getObjConexao().prepareStatement("SELECT * FROM SUPERMERCADO");
		
		objCursor = objExecucao.executeQuery();
		
		while (objCursor.next()) {
			retorno.add(new Supermercado(objCursor.getString("CNPJ_SUPERMERCADO"),
								  		 objCursor.getString("NOME"),
								  		 objCursor.getString("EMAIL"),
								  		 objCursor.getString("NUM_ESTABELECIMENTO"),
								  		 objCursor.getString("CEP"),
								  		 objCursor.getString("TELEFONE")));
		}
		
		objBanco.desconectar();
		
		return retorno;
	}
	
	//MÉTODO INCLUIR
	public void persistir(Supermercado objSupermercado) throws Exception {
		objBanco = new BancoDeDados();
		
		objBanco.conectar();
		
		objExecucao = objBanco.getObjConexao().prepareStatement("INSERT INTO SUPERMERCADO" +
																"(CNPJ_SUPERMERCADO, NOME, EMAIL, NUM_ESTABELECIMENTO, CEP, TELEFONE) " + 
																"VALUES" +
																"(?, ?, ?, ?, ?, ?)");
		
		objExecucao.setString(1, objSupermercado.getCnpjDoSupermercado());
		objExecucao.setString(2, objSupermercado.getNome());
		objExecucao.setString(3, objSupermercado.getEmail());
		objExecucao.setString(4, objSupermercado.getNumeroDoEstabelecimento());
		objExecucao.setString(5, objSupermercado.getCep());
		objExecucao.setString(6, objSupermercado.getTelefone());
		
		objExecucao.executeUpdate();
		
		objBanco.desconectar();
	}
}
