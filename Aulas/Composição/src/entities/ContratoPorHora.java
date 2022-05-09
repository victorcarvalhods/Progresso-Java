package entities;

import java.util.Date;

public class ContratoPorHora {
	private Date data;
	private Double valorPorHora;
	private Integer horasTrabalho;
	
	
	public ContratoPorHora(Date data, Double valorPorHora, Integer horasTrabalho) {
		this.data = data;
		this.valorPorHora = valorPorHora;
		this.horasTrabalho = horasTrabalho;
	}

	public Double valorTotal() {
		return horasTrabalho * valorPorHora;
	}

	public Date getData() {
		return data;
	}


	public void setData(Date data) {
		this.data = data;
	}


	public Double getValorPorHora() {
		return valorPorHora;
	}


	public void setValorPorHora(Double valorPorHora) {
		this.valorPorHora = valorPorHora;
	}


	public Integer getHorasTrabalho() {
		return horasTrabalho;
	}


	public void setHorasTrabalho(Integer horasTrabalho) {
		this.horasTrabalho = horasTrabalho;
	}
	
	
	
	
}
