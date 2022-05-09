package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import entities.enums.NivelEspecializacao;

public class Trabalhador {
	private final String nome;
	private NivelEspecializacao level;
	private Double salarioBase;
	private List<ContratoPorHora> contratos = new ArrayList<>();
	private Departamento departamento;
	
	
	
	public Trabalhador(String nome, NivelEspecializacao level, Double salarioBase,
			Departamento departamento) {
		super();
		this.nome = nome;
		this.level = level;
		this.salarioBase = salarioBase;
		this.departamento = departamento;
	}
	
	
	public void adicionarContrato(ContratoPorHora contrato) {
		contratos.add(contrato);
	}
	
	public void removerContrato(ContratoPorHora contrato) {
		contratos.remove(contrato);
	}
	
	public Double aReceber(Integer ano, Integer mes) {
		Double soma = (double) 0 + salarioBase;
		Calendar cal = Calendar.getInstance();
		
		for (ContratoPorHora contratoX: contratos) {
			cal.setTime(contratoX.getData());
			int c_ano = cal.get(Calendar.YEAR);
			int c_month = cal.get(Calendar.MONTH);
			if (ano == c_ano && mes - 1 == c_month) {
				soma += contratoX.valorTotal();
			}
		}
		return soma;
		
	}
	


	public NivelEspecializacao getLevel() {
		return level;
	}


	public void setLevel(NivelEspecializacao level) {
		this.level = level;
	}


	public Double getSalarioBase() {
		return salarioBase;
	}


	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}


	public Departamento getDepartamento() {
		return departamento;
	}


	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}


	public String getNome() {
		return nome;
	}


	public List<ContratoPorHora> getContratos() {
		return contratos;
	}
	
	
	
	
	
	
	
	
	
	
}
