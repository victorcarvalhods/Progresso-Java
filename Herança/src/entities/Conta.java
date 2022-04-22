package entities;

public class Conta {
	
	private Integer numero_conta;
	private String titular;
	protected Double saldo;
	
	public Conta() {
		
	}

	public Conta(Integer numero_conta, String titular, Double balance) {
		this.numero_conta = numero_conta;
		this.titular = titular;
		this.saldo = balance;
	}

	public void saque(double quantidade) {
		saldo -= (quantidade + 5.0);
	}
	
	public void deposito(double valor) {
		saldo += valor;
	}
	
	public Integer getNumero_conta() {
		return numero_conta;
	}

	public void setNumero_conta(Integer numero_conta) {
		this.numero_conta = numero_conta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Double getSaldo() {
		return saldo;
	}


	
}
