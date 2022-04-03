package apresentacao;

import negocio.Marca;

public class TesteIncluir {
	public static void main(String[] args) {
		Marca objMarca1 = new Marca();
		
		objMarca1.setCnpjDaMarca("M3");
		objMarca1.setEmail("email@email");
		objMarca1.setNome("Bauduco");
		objMarca1.setTelefone("1234-1234");
		
		try {
			objMarca1.persistir();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
