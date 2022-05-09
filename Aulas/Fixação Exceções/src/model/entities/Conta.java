package model.entities;

import model.Exception.DomainException;

public class Conta {
	private Integer conta;
	private final String nome;
	private Double saldo;
	private Double limiteSaque;
	

	public Conta(Integer conta, String nome, Double saldo, Double limiteSaque) {
		super();
		this.conta = conta;
		this.nome = nome;
		this.saldo = saldo;
		this.limiteSaque = limiteSaque;
	}


	public Integer getConta() {
		return conta;
	}


	public void setConta(Integer conta) {
		this.conta = conta;
	}


	public Double getSaldo() {
		return saldo;
	}


	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}


	public Double getLimiteSaque() {
		return limiteSaque;
	}


	public void setLimiteSaque(Double limiteSaque) {
		this.limiteSaque = limiteSaque;
	}


	public String getNome() {
		return nome;
	}
	
	public void deposito(double quantia) {
		saldo += quantia;
	}
	
	public void saque(double quantia) throws DomainException {
		if (quantia > saldo) {
			throw new DomainException("Saldo insuficiente para realizar transação.");
		}if (quantia > limiteSaque) {
			throw new DomainException("Quantia de saque excede limite de saque.");
		}
		saldo -= quantia;
	}
	
	

}
