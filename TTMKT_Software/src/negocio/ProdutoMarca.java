package negocio;

public class ProdutoMarca {
	//DECLARA��O DE VARI�VEIS
	private String codigoProdutoMarca = "";
	private String codigoDoProduto = "";
	private String cnpjDaMarca = "";
	private String medida = "";
	//M�TODO CONSTRUTOR VAZIO
	public ProdutoMarca() {
		super();
	}
	//M�TODO CONSTRUTOR CHEIO
	public ProdutoMarca(String codigoProdutoMarca, String codigoDoProduto, String cnpjDaMarca, String medida) {
		super();
		this.codigoProdutoMarca = codigoProdutoMarca;
		this.codigoDoProduto = codigoDoProduto;
		this.cnpjDaMarca = cnpjDaMarca;
		this.medida = medida;
	}
	//METODOS GET/SET DA CLASSE
	public String getCodigoProdutoMarca() {
		return codigoProdutoMarca;
	}

	public void setCodigoProdutoMarca(String codigoProdutoMarca) {
		this.codigoProdutoMarca = codigoProdutoMarca;
	}

	public String getCodigoDoProduto() {
		return codigoDoProduto;
	}

	public void setCodigoDoProduto(String codigoDoProduto) {
		this.codigoDoProduto = codigoDoProduto;
	}

	public String getCnpjDaMarca() {
		return cnpjDaMarca;
	}

	public void setCnpjDaMarca(String cnpjDaMarca) {
		this.cnpjDaMarca = cnpjDaMarca;
	}

	public String getMedida() {
		return medida;
	}

	public void setMedida(String medida) {
		this.medida = medida;
	}
	
	
	
}
