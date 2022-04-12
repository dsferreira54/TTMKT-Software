package apresentacao;

import negocio.SupermercadoContrato;

public class TesteIncluirSupermercadoContrato {
	public static void main(String[] args) {
		SupermercadoContrato objSupermercadoContrato1 = new SupermercadoContrato();
		
		objSupermercadoContrato1.setCnpjDoSupermercado("03.423.512. 346/0001-97");
		objSupermercadoContrato1.setCodigoDoContrato("553721");
		
		
		try {
			objSupermercadoContrato1.persistir();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}