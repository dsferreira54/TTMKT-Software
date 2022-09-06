package testes;

import negocio.Marca;

public class TesteConsultarMarca {
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
