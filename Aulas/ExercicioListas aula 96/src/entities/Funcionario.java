package entities;

public class Funcionario {
	private Integer id;
	private String nome;
	private Double salario;
	
	public Funcionario(int id, String nome, double salario) {
		super();
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}
	
	public void aumento(float porcentagemDeAumento) {
		double aux = salario + salario*porcentagemDeAumento / 100;
		setSalario(aux);
	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	private void setSalario(double salario) {
		this.salario = salario;
	}
	
	@Override
	public String toString() {
		return id + ", " + nome + ", " + salario;
	}
	
	

}
