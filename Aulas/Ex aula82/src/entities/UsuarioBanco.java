package entities;

public class UsuarioBanco {
	private String nome;
	private int numConta;
	private double saldo;
	
	public UsuarioBanco(String nome, int numConta, double saldo) {
		super();
		this.nome = nome;
		this.numConta = numConta;
		this.deposito(saldo);
	}

	public UsuarioBanco(String nome, int numConta) {
		super();
		this.nome = nome;
		this.numConta = numConta;
	}
	
	@Override
	public String toString() {
		return "nome: " + nome 
				+ " Número da conta: " + numConta
				+ " saldo atual: " + saldo;
	}
	
	public void saque(double saldo) {
		this.saldo -= saldo;
	}
	
	public void deposito(double saldo) {
		this.saldo += saldo;
	}
	public int getNumConta() {
		return numConta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}


	
	
}
