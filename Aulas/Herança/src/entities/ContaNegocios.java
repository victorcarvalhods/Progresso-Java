package entities;

public class ContaNegocios extends Conta{

	private Double limiteEmprestio;
	
	public ContaNegocios() {
		super();
		
	}

	public ContaNegocios(Integer numero_conta, String titular, Double balance, Double limiteEmprestio) {
		super(numero_conta, titular, balance);
		this.limiteEmprestio = limiteEmprestio;
	}

	public Double getLimiteEmprestio() {
		return limiteEmprestio;
	}

	public void setLimiteEmprestio(Double limiteEmprestio) {
		this.limiteEmprestio = limiteEmprestio;
	}
	
	public void emprestimo(double quantia) {
		if (quantia <= limiteEmprestio) {
			saldo += quantia - 10.0;
		}
	}

	@Override
	public void saque(double quantidade) {
		super.saque(quantidade);
		saldo -= 2.0;
	}
	
	
	
	
}
