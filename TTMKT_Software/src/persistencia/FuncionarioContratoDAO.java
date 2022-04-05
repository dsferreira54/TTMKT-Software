package persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;

import negocio.FuncionarioContrato;

public class FuncionarioContratoDAO {
	//PROPRIEDADES DA CLASSE
	private BancoDeDados objBanco = null;
	private PreparedStatement objExecucao = null;
	private ResultSet objCursor = null;
	
	//MÉTODO GET TODOS
	public Collection<FuncionarioContrato> getTodos() throws Exception {
		ArrayList<FuncionarioContrato> retorno = new ArrayList<FuncionarioContrato>();
		
		objBanco = new BancoDeDados();
		
		objBanco.conectar();
		
		objExecucao = objBanco.getObjConexao().prepareStatement("SELECT * FROM FUNCIONARIO_CONTRATO");
		
		objCursor = objExecucao.executeQuery();
		
		while (objCursor.next()) {
			retorno.add(new FuncionarioContrato(objCursor.getString("CODIGO_CONTRATO"),
								  				objCursor.getString("CPF_FUNCIONARIO")));
		}
		
		objBanco.desconectar();
		
		return retorno;
	}
	
	//MÉTODO INCLUIR
	public void persistir(FuncionarioContrato objFuncionarioContratoDAO) throws Exception {
		objBanco = new BancoDeDados();
		
		objBanco.conectar();
		
		objExecucao = objBanco.getObjConexao().prepareStatement("INSERT INTO PRODUTO_MARCA " +
																"(CODIGO_CONTRATO, CPF_FUNCIONARIO) " + 
																"VALUES" +
																"(?, ?)");
		
		objExecucao.setString(1, objFuncionarioContratoDAO.getCodigoDoContrato());
		objExecucao.setString(2, objFuncionarioContratoDAO.getCpfDoFuncionario());
		
		objExecucao.executeUpdate();
		
		objBanco.desconectar();
	}
}
