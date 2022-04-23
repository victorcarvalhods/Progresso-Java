package entities;

public class ContaPoupanca extends Conta {
	
	private Double taxaJuros;
	
	public ContaPoupanca() {
		super();
	}

	public ContaPoupanca(Integer numero_conta, String titular, Double balance, Double taxaJuros) {
		super(numero_conta, titular, balance);
		this.taxaJuros = taxaJuros;
	}

	public Double getTaxaJuros() {
		return taxaJuros;
	}

	public void setTaxaJuros(Double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}
	
	
	public void atualizaSaldo() {
		saldo += saldo * taxaJuros;
	}
	
	@Override
	public final void saque(double quantia) {
		saldo -= quantia;
	}
	
	

}
