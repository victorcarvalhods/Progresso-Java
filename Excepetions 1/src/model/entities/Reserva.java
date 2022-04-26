package model.entities;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reserva {
	private Integer numeroQuarto;
	private Date entrada;
	private Date saida;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Reserva() {
		
	}

	public Reserva(Integer numeroQuarto, Date entrada, Date saida) {
		this.numeroQuarto = numeroQuarto;
		this.entrada = entrada;
		this.saida = saida;
	}
	
	public long duracao() {
		long diff = saida.getTime() - entrada.getTime();
		
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}
	
	public String atualizarDatas(Date entrada, Date saida) {
		
		Date agora = new Date();
		
		if (entrada.before(agora) || saida.before(agora)) {
			return "Data de entrada ou saída devem ser em dias posteriores em relação a data atual";
		}
		if (!saida.after(entrada)) {
			return "Data da saida está em uma data anterior a data de entrada.";
		} else {
			this.entrada = entrada;
			this.saida = saida;
			return null;
		}
	}

	public Integer getNumeroQuarto() {
		return numeroQuarto;
	}

	public void setNumeroQuarto(Integer numeroQuarto) {
		this.numeroQuarto = numeroQuarto;
	}

	public Date getEntrada() {
		return entrada;
	}

	public void setEntrada(Date entrada) {
		this.entrada = entrada;
	}

	public Date getSaida() {
		return saida;
	}

	public void setSaida(Date saida) {
		this.saida = saida;
	}
	
	@Override
	public String toString() {
		return "Quarto " + numeroQuarto 
				+ ", entrada: " 
				+ sdf.format(entrada) 
				+ ", saída: " 
				+ sdf.format(saida) 
				+ ", " + duracao() + " noites";
	}
	
	
	
}
