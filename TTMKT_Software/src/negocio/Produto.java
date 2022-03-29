package negocio;

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
}
