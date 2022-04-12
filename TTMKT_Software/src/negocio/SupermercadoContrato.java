package negocio;

import java.util.Collection;

import persistencia.SupermercadoContratoDAO;

public class SupermercadoContrato {
	//DECLARAÇÃO DE VARIÁVEIS
	private String cnpjDoSupermercado = "";
	private String codigoDoContrato = "";
	
	//MÉTODO CONSTRUTOR VAZIO
	public SupermercadoContrato() {
		super();
	}
	
	//MÉTODO CONSTRUTOR CHEIO
	public SupermercadoContrato(String cnpjDoSupermercado, String codigoDoContrato) {
		super();
		this.cnpjDoSupermercado = cnpjDoSupermercado;
		this.codigoDoContrato = codigoDoContrato;
	}
	
	//METODOS GET/SET DA CLASSE
	public String getCnpjDoSupermercado() {
		return cnpjDoSupermercado;
	}

	public void setCnpjDoSupermercado(String cnpjDoSupermercado) {
		this.cnpjDoSupermercado = cnpjDoSupermercado;
	}

	public String getCodigoDoContrato() {
		return codigoDoContrato;
	}

	public void setCodigoDoContrato(String codigoDoContrato) {
		this.codigoDoContrato = codigoDoContrato;
	}


//MÉTODO GET TODOS DO BANCO DE DADOS
	public static Collection<SupermercadoContrato> getTodos() throws Exception {
		return new SupermercadoContratoDAO().getTodos();		
	}
	
	//MÉTODO PERSISTIR NO BANCO DE DADOS
	public void persistir() throws Exception {
		new SupermercadoContratoDAO().persistir(this);
	}
}