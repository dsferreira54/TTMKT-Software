package negocio;

import java.util.Calendar;
import java.util.Date;

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
	
	public void setDataVindoDeBD(Date dataDeInicio) {
		this.dataDeInicio = dataDeInicio;
	}
	
	
	public String getDataDeInicioParaApresentacao() {
		String retorno = "";
		
		Calendar objCalendario = Calendar.getInstance();
		objCalendario.setTime(getDataDeInicio());
		
		retorno = objCalendario.get(Calendar.DAY_OF_MONTH) + "/" +
				  (objCalendario.get(Calendar.MONTH) + 1) + "/" +
				  objCalendario.get(Calendar.YEAR);
				  
		return retorno;
	}
	
	public String getDataDeInicioParaPersistencia() {
		String retorno = "";
		
		Calendar objCalendario = Calendar.getInstance();
		objCalendario.setTime(getDataDeInicio());
		
		retorno = objCalendario.get(Calendar.YEAR) + "-" +
				  (objCalendario.get(Calendar.MONTH) + 1) + "-" +
				  objCalendario.get(Calendar.DAY_OF_MONTH);
				  
		return retorno;
	}

	public void setDataDeInicioDaApresentaca(String data) {
		Calendar objCalendario = Calendar.getInstance();
		
		objCalendario.set(Calendar.DAY_OF_MONTH, Integer.parseInt(data.substring(0, 2)));
		objCalendario.set(Calendar.MONTH, Integer.parseInt(data.substring(3, 5)) - 1);
		objCalendario.set(Calendar.YEAR, Integer.parseInt(data.substring(6)));
		
		setDataDeInicio(objCalendario.getTime());
	}
	
	public void setDataDeInicioDaPersistencia(String data) {
		Calendar objCalendario = Calendar.getInstance();
		
		objCalendario.set(Calendar.YEAR, Integer.parseInt(data.substring(0, 4)));
		objCalendario.set(Calendar.MONTH, Integer.parseInt(data.substring(5, 7)) - 1);
		objCalendario.set(Calendar.DAY_OF_MONTH, Integer.parseInt(data.substring(8)));
		
		setDataDeInicio(objCalendario.getTime());
	}
	
	//DATA DE TERMINO
	public String getDataDeTerminoParaApresentacao() {
		String retorno = "";
		
		Calendar objCalendario = Calendar.getInstance();
		objCalendario.setTime(getDataDeTermino());
		
		retorno = objCalendario.get(Calendar.DAY_OF_MONTH) + "/" +
				  (objCalendario.get(Calendar.MONTH) + 1) + "/" +
				  objCalendario.get(Calendar.YEAR);
				  
		return retorno;
	}
	
	public String getDataDeTerminoParaPersistencia() {
		String retorno = "";
		
		Calendar objCalendario = Calendar.getInstance();
		objCalendario.setTime(getDataDeTermino());
		
		retorno = objCalendario.get(Calendar.YEAR) + "-" +
				  (objCalendario.get(Calendar.MONTH) + 1) + "-" +
				  objCalendario.get(Calendar.DAY_OF_MONTH);
				  
		return retorno;
	}

	public void setDataDeTerminoDaApresentaca(String data) {
		Calendar objCalendario = Calendar.getInstance();
		
		objCalendario.set(Calendar.DAY_OF_MONTH, Integer.parseInt(data.substring(0, 2)));
		objCalendario.set(Calendar.MONTH, Integer.parseInt(data.substring(3, 5)) - 1);
		objCalendario.set(Calendar.YEAR, Integer.parseInt(data.substring(6)));
		
		setDataDeTermino(objCalendario.getTime());
	}
	
	public void setDataDeTerminoDaPersistencia(String data) {
		Calendar objCalendario = Calendar.getInstance();
		
		objCalendario.set(Calendar.YEAR, Integer.parseInt(data.substring(0, 4)));
		objCalendario.set(Calendar.MONTH, Integer.parseInt(data.substring(5, 7)) - 1);
		objCalendario.set(Calendar.DAY_OF_MONTH, Integer.parseInt(data.substring(8)));
		
		setDataDeTermino(objCalendario.getTime());
	}
	
}
