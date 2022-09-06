package testes;

import negocio.Produto;

public class TesteIncluirProduto {
	public static void main(String[] args) {
		Produto objProduto1 = new Produto();
		
		objProduto1.setCodigoDoProduto("P1");
		objProduto1.setNome("Roll Cake");
		
		try {
			objProduto1.persistir();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}