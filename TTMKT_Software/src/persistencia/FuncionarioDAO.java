package persistencia;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;

import negocio.Funcionario;

public class FuncionarioDAO {
	//PROPRIEDADES DA CLASSE
	private BancoDeDados objBanco = null;
	private PreparedStatement objExecucao = null;
	private ResultSet objCursor = null;
	
	//MÉTODO GET TODOS
	public Collection<Funcionario> getTodos() throws Exception {
		ArrayList<Funcionario> retorno = new ArrayList<Funcionario>();
		
		objBanco = new BancoDeDados();
		
		objBanco.conectar();
		
		objExecucao = objBanco.getObjConexao().prepareStatement("SELECT * FROM FUNCIONARIO");
		
		objCursor = objExecucao.executeQuery();
		
		while (objCursor.next()) {
			retorno.add(new Funcionario(objCursor.getString("CPF_FUNCIONARIO"),
								  		objCursor.getString("TELEFONE"),
								  		objCursor.getString("EMAIL"),
								  		objCursor.getString("RG"),
								  		objCursor.getString("CARGO"),
								  		objCursor.getDate("DATA_ADMISSAO"),
								  		objCursor.getDate("DATA_NASCIMENTO"),
								  		objCursor.getInt("CNH"),
								  		objCursor.getString("SEXO"),
								  		objCursor.getString("NUMERO_CASA"),
								  		objCursor.getString("CEP"),
								  		objCursor.getString("ULTIMO_NOME"),
								  		objCursor.getString("PRIMEIRO_NOME")));
		}
		
		objBanco.desconectar();
		
		return retorno;
	}
	
	//MÉTODO INCLUIR
	public void persistir(Funcionario objSupermercado) throws Exception {
		objBanco = new BancoDeDados();
		
		objBanco.conectar();
		
		objExecucao = objBanco.getObjConexao().prepareStatement("INSERT INTO FUNCIONARIO" +
																"(CPF_FUNCIONARIO, TELEFONE, EMAIL, " +
																"RG, CARGO, DATA_ADMISSAO, DATA_NASCIMENTO, CNH, SEXO, " +
																"NUMERO_CASA, CEP, ULTIMO_NOME, PRIMEIRO_NOME) " + 
																"VALUES" +
																"(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
		
		objExecucao.setString(1, objSupermercado.getCpfDoFuncionario());
		objExecucao.setString(2, objSupermercado.getTelefone());
		objExecucao.setString(3, objSupermercado.getEmail());
		objExecucao.setString(4, objSupermercado.getRg());
		objExecucao.setString(5, objSupermercado.getCargo());
		objExecucao.setDate(6, (Date) objSupermercado.getDataDeAdmissao()); ////////////////////////ERRADO\\\\\\\\\\\\\\\\\\\\\\\\
		objExecucao.setDate(7, (Date) objSupermercado.getDataDeNascimento()); ////////////////////////ERRADO\\\\\\\\\\\\\\\\\\\\\\\\
		objExecucao.setInt(8, objSupermercado.getCnh());
		objExecucao.setString(9, objSupermercado.getSexo());
		objExecucao.setString(10, objSupermercado.getNumeroDaCasa());
		objExecucao.setString(11, objSupermercado.getCep());
		objExecucao.setString(12, objSupermercado.getUltimoNome());
		objExecucao.setString(13, objSupermercado.getPrimeiroNome());
		
		objExecucao.executeUpdate();
		
		objBanco.desconectar();
	}
}
