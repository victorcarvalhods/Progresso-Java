package entities;

public class Funcionario {
	private final String nome;
	private Integer horasDeTrabalho;
	private Double valorPorHora;
	

	public Funcionario(String nome, Integer horasDeTrabalho, Double valorPorHora) {
		this.nome = nome;
		this.horasDeTrabalho = horasDeTrabalho;
		this.valorPorHora = valorPorHora;
	}
	
	public double pagamento() {
		return horasDeTrabalho * valorPorHora;
	}

	public Integer getHorasDeTrabalho() {
		return horasDeTrabalho;
	}

	public void setHorasDeTrabalho(Integer horasDeTrabalho) {
		this.horasDeTrabalho = horasDeTrabalho;
	}

	public Double getValorPorHora() {
		return valorPorHora;
	}

	public void setValorPorHora(Double valorPorHora) {
		this.valorPorHora = valorPorHora;
	}

	public String getNome() {
		return nome;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Nome: " + nome);
		sb.append(String.format(", Salário: R$ %.2f", pagamento()));
		
		return sb.toString();
	}
	
}
