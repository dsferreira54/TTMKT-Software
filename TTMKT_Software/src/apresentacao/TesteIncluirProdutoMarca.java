package apresentacao;

import negocio.ProdutoMarca;

public class TesteIncluirProdutoMarca {
	public static void main(String[] args) {
		ProdutoMarca objProdutoMarca1 = new ProdutoMarca();
		
		objProdutoMarca1.setCodigoDoProduto("P1");
		objProdutoMarca1.setCnpjDaMarca("M3");
		objProdutoMarca1.setMedida("575g");
		
		try {
			objProdutoMarca1.persistir();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}