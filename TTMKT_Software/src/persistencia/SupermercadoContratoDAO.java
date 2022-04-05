package persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;

import negocio.SupermercadoContrato;

public class SupermercadoContratoDAO {
	
	//PROPRIEDADES DA CLASSE
	private BancoDeDados objBanco = null;
	private PreparedStatement objExecucao = null;
	private ResultSet objCursor = null;

	//MÉTODO GET TODOS
	public Collection<SupermercadoContrato> getTodos() throws Exception {
		ArrayList<SupermercadoContrato> retorno = new ArrayList<SupermercadoContrato>();
		
		objBanco = new BancoDeDados();
		
		objBanco.conectar();
		
		objExecucao = objBanco.getObjConexao().prepareStatement("SELECT * FROM SUPERMERCADO_CONTRATO");
		
		objCursor = objExecucao.executeQuery();
		
		while (objCursor.next()) {
			retorno.add(new SupermercadoContrato(objCursor.getString("CNPJ_SUPERMERCADO"),
								  		 		 objCursor.getString("CODIGO_CONTRATO")));
		}
		
		objBanco.desconectar();
		
		return retorno;
	}
	
	//METODO INCUIR 
	public void persistir(SupermercadoContrato objSupermercado) throws Exception {
		objBanco = new BancoDeDados();
		
		objBanco.conectar();
		
		objExecucao = objBanco.getObjConexao().prepareStatement("INSERT INTO SUPERMERCADO_CONTRATO" +
																"(CNPJ_SUPERMERCADO, CODIGO_CONTRATO) " + 
																"VALUES" +
																"(?, ?)");
		
		objExecucao.setString(1, objSupermercado.getCnpjDoSupermercado());
		objExecucao.setString(2, objSupermercado.getCodigoDoContrato());
		
		objExecucao.executeUpdate();
		
		objBanco.desconectar();
	} 
}
