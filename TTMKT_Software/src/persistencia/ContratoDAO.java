package persistencia;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;

import negocio.Contrato;

public class ContratoDAO {
	//PROPRIEDADES DA CLASSE
	private BancoDeDados objBanco = null;
	private PreparedStatement objExecucao = null;
	private ResultSet objCursor = null;
	
	//MÉTODO GET TODOS
	public Collection<Contrato> getTodos() throws Exception {
		ArrayList<Contrato> retorno = new ArrayList<Contrato>();
		
		objBanco = new BancoDeDados();
		
		objBanco.conectar();
		
		objExecucao = objBanco.getObjConexao().prepareStatement("SELECT * FROM CONTRATO");
		
		objCursor = objExecucao.executeQuery();
		
		while (objCursor.next()) {
			retorno.add(new Contrato(objCursor.getString("CODIGO_CONTRATO"),
								  	 objCursor.getDate("DATA_INICIO"),
								  	 objCursor.getDate("DATA_TERMINO")));
		}
		
		objBanco.desconectar();
		
		return retorno;
	}
	

	//MÉTODO INCLUIR
	public void persistir(Contrato objContrato) throws Exception {
		objBanco = new BancoDeDados();
		
		objBanco.conectar();
		
		objExecucao = objBanco.getObjConexao().prepareStatement("INSERT INTO CONTRATO " +
																"(CODIGO_CONTRATO, DATA_INICIO, DATA_TERMINO) " + 
																"VALUES" +
																"(?, ?, ?)");
		
		objExecucao.setString(1, objContrato.getCodigoDoContrato());
		objExecucao.setDate(2, (Date) objContrato.getDataDeInicio());
		objExecucao.setDate(3, (Date) objContrato.getDataDeTermino());
		
		objExecucao.executeUpdate();
		
		objBanco.desconectar();
	}
}
