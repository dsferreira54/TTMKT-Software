package negocio;

public class ProdutoMarcaContrato {
	//DECLARAÇÃO DE VARIÁVEIS
	private String codigoProdutoMarca = "";
	private String codigoDoContrato = "";
	
	//MÉTODO CONSTRUTOR VAZIO
	public ProdutoMarcaContrato() {
		super();
	}
	
	//MÉTODO CONSTRUTOR CHEIO
	public ProdutoMarcaContrato(String codigoProdutoMarca, String codigoDoContrato) {
		super();
		this.codigoProdutoMarca = codigoProdutoMarca;
		this.codigoDoContrato = codigoDoContrato;
	}
	
	//METODOS GET/SET DA CLASSE
	public String getCodigoProdutoMarca() {
		return codigoProdutoMarca;
	}

	public void setCodigoProdutoMarca(String codigoProdutoMarca) {
		this.codigoProdutoMarca = codigoProdutoMarca;
	}

	public String getCodigoDoContrato() {
		return codigoDoContrato;
	}

	public void setCodigoDoContrato(String codigoDoContrato) {
		this.codigoDoContrato = codigoDoContrato;
	}
}
