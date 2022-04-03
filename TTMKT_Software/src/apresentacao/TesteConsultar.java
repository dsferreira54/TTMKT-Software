package apresentacao;

import negocio.Marca;

public class TesteConsultar {
	public static void main(String[] args) {
		try {
			for (Marca objMarca : Marca.getTodos()) {
				System.out.println(objMarca.getCnpjDaMarca());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
