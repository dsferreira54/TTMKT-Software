package negocio;

import java.util.Date;

public class Funcionario {
	//DECLARAÇÃO DE VARIÁVEIS
	private String cpfDoFuncionario = "";
	private String telefone = "";
	private String email = "";
	private String rg = "";
	private String cargo = "";
	private Date dataDeAdmissao = null;
	private Date dataDeNascimento = null;
	private int cnh = 0;
	private String sexo = "";
	private String numeroDaCasa = "";
	private String cep = "";
	private String ultimoNome = "";
	private String primeiroNome = "";
	//MÉTODO CONSTRUTOR VAZIO
	public Funcionario() {
		super();
	}
	//MÉTODO CONSTRUTOR CHEIO
	public Funcionario(String cpfDoFuncionario, String telefone, String email, String rg, String cargo,
			Date dataDeAdmissao, Date dataDeNascimento, int cnh, String sexo, String numeroDaCasa, String cep,
			String ultimoNome, String primeiroNome) {
		super();
		this.cpfDoFuncionario = cpfDoFuncionario;
		this.telefone = telefone;
		this.email = email;
		this.rg = rg;
		this.cargo = cargo;
		this.dataDeAdmissao = dataDeAdmissao;
		this.dataDeNascimento = dataDeNascimento;
		this.cnh = cnh;
		this.sexo = sexo;
		this.numeroDaCasa = numeroDaCasa;
		this.cep = cep;
		this.ultimoNome = ultimoNome;
		this.primeiroNome = primeiroNome;
	}
	//METODOS GET/SET DA CLASSE
	public String getCpfDoFuncionario() {
		return cpfDoFuncionario;
	}
	public void setCpfDoFuncionario(String cpfDoFuncionario) {
		this.cpfDoFuncionario = cpfDoFuncionario;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public Date getDataDeAdmissao() {
		return dataDeAdmissao;
	}
	public void setDataDeAdmissao(Date dataDeAdmissao) {
		this.dataDeAdmissao = dataDeAdmissao;
	}
	public Date getDataDeNascimento() {
		return dataDeNascimento;
	}
	public void setDataDeNascimento(Date dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	public int getCnh() {
		return cnh;
	}
	public void setCnh(int cnh) {
		this.cnh = cnh;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getNumeroDaCasa() {
		return numeroDaCasa;
	}
	public void setNumeroDaCasa(String numeroDaCasa) {
		this.numeroDaCasa = numeroDaCasa;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getUltimoNome() {
		return ultimoNome;
	}
	public void setUltimoNome(String ultimoNome) {
		this.ultimoNome = ultimoNome;
	}
	public String getPrimeiroNome() {
		return primeiroNome;
	}
	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}
	
	
}
