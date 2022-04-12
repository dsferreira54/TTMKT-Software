package negocio;

import java.util.Collection;

import persistencia.SupermercadoDAO;

public class Supermercado {
	//DECLARAÇÃO DE VARIÁVEIS
	private String cnpjDoSupermercado = "";
	private String nome = "";
	private String email = "";
	private String numeroDoEstabelecimento = "";
	private String cep = "";
	private String telefone = "";
	
	//MÉTODO CONSTRUTOR VAZIO
	public Supermercado() {
		super();
	}
	
	//MÉTODO CONSTRUTOR CHEIO
	public Supermercado(String cnpjDoSupermercado, String nome, String email, String numeroDoEstabelecimento,
			String cep, String telefone) {
		super();
		this.cnpjDoSupermercado = cnpjDoSupermercado;
		this.nome = nome;
		this.email = email;
		this.numeroDoEstabelecimento = numeroDoEstabelecimento;
		this.cep = cep;
		this.telefone = telefone;
	}
	
	//METODOS GET/SET DA CLASSE
	public String getCnpjDoSupermercado() {
		return cnpjDoSupermercado;
	}
	
	public void setCnpjDoSupermercado(String cnpjDoSupermercado) {
		this.cnpjDoSupermercado = cnpjDoSupermercado;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getNumeroDoEstabelecimento() {
		return numeroDoEstabelecimento;
	}
	
	public void setNumeroDoEstabelecimento(String numeroDoEstabelecimento) {
		this.numeroDoEstabelecimento = numeroDoEstabelecimento;
	}
	
	public String getCep() {
		return cep;
	}
	
	public void setCep(String cep) {
		this.cep = cep;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	//MÉTODO GET TODOS DO BANCO DE DADOS
		public static Collection<Supermercado> getTodos() throws Exception {
			return new SupermercadoDAO().getTodos();		
		}
		
		//MÉTODO PERSISTIR NO BANCO DE DADOS
		public void persistir() throws Exception {
			new SupermercadoDAO().persistir(this);
		}
	}
