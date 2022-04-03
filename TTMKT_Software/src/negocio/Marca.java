package negocio;

import java.util.Collection;

import persistencia.MarcaDAO;

public class Marca {
	//DECLARAÇÃO DE VARIÁVEIS
	private String cnpjDaMarca = "";
	private String telefone = "";
	private String email = "";
	private String nome = "";
	
	//MÉTODO CONSTRUTOR VAZIO
	public Marca() {
		super();
	}
	
	//MÉTODO CONSTRUTOR CHEIO
	public Marca(String cnpjDaMarca, String telefone, String email, String nome) {
		super();
		this.cnpjDaMarca = cnpjDaMarca;
		this.telefone = telefone;
		this.email = email;
		this.nome = nome;
	}
	
	//METODOS GET/SET DA CLASSE
	public String getCnpjDaMarca() {
		return cnpjDaMarca;
	}

	public void setCnpjDaMarca(String cnpjDaMarca) {
		this.cnpjDaMarca = cnpjDaMarca;
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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	//MÉTODO GET TODOS DO BANCO DE DADOS
	public static Collection<Marca> getTodos() throws Exception {
		return new MarcaDAO().getTodos();		
	}
	
	//MÉTODO PERSISTIR NO BANCO DE DADOS
	public void persistir() throws Exception {
		new MarcaDAO().persistir(this);
	}
}
