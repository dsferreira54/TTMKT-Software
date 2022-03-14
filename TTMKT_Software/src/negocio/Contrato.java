package negocio;

import java.sql.Date;

public class Contrato {
	//DECLARAÇÃO DE VARIÁVEIS
	private String codigoDoContrato = "";
	private Date dataDeInicio = null;
	private Date dataDeTermino = null;
	//MÉTODO CONSTRUTOR VAZIO
	public Contrato() {
		super();
	}
	//MÉTODO CONSTRUTOR CHEIO
	public Contrato(String codigoDoContrato, Date dataDeInicio, Date dataDeTermino) {
		super();
		this.codigoDoContrato = codigoDoContrato;
		this.dataDeInicio = dataDeInicio;
		this.dataDeTermino = dataDeTermino;
	}
	//METODOS GET/SET DA CLASSE
	public String getCodigoDoContrato() {
		return codigoDoContrato;
	}

	public void setCodigoDoContrato(String codigoDoContrato) {
		this.codigoDoContrato = codigoDoContrato;
	}

	public Date getDataDeInicio() {
		return dataDeInicio;
	}

	public void setDataDeInicio(Date dataDeInicio) {
		this.dataDeInicio = dataDeInicio;
	}

	public Date getDataDeTermino() {
		return dataDeTermino;
	}

	public void setDataDeTermino(Date dataDeTermino) {
		this.dataDeTermino = dataDeTermino;
	}
	
	
}
