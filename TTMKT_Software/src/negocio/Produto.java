package negocio;

import java.util.Collection;

import persistencia.ProdutoDAO;

public class Produto {
	//DECLARAÇÃO DE VARIÁVEIS
	private String codigoDoProduto = "";
	private String nome = "";
	
	//MÉTODO CONSTRUTOR VAZIO
	public Produto() {
		super();
	}
	
	//MÉTODO CONSTRUTOR CHEIO
	public Produto(String codigoDoProduto, String nome) {
		super();
		this.codigoDoProduto = codigoDoProduto;
		this.nome = nome;
	}
	
	//METODOS GET/SET DA CLASSE
	public String getCodigoDoProduto() {
		return codigoDoProduto;
	}

	public void setCodigoDoProduto(String codigoDoProduto) {
		this.codigoDoProduto = codigoDoProduto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	//MÉTODO GET TODOS DO BANCO DE DADOS
	public static Collection<Produto> getTodos() throws Exception {
		return new ProdutoDAO().getTodos();		
	}
	
	//MÉTODO PERSISTIR NO BANCO DE DADOS
	public void persistir() throws Exception {
		new ProdutoDAO().persistir(this);
	}
}
