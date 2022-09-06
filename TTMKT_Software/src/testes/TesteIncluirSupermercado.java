package testes;

import negocio.Supermercado;

public class TesteIncluirSupermercado {
	public static void main(String[] args) {
		Supermercado objSupermercado1 = new Supermercado();
		
		objSupermercado1.setCnpjDoSupermercado("03.423.512. 346/0001-97");
		objSupermercado1.setNome("Carrefour");
		objSupermercado1.setEmail("CarrefourAjuda@gmail.com");
		objSupermercado1.setNumeroDoEstabelecimento("22");
		objSupermercado1.setCep("93054-088");
		objSupermercado1.setTelefone("4002-8922");
		
		
		try {
			objSupermercado1.persistir();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}