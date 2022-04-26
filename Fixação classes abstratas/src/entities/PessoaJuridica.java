package entities;

public class PessoaJuridica extends Pessoa{
	
	private Integer qntdFuncionarios;

	
	public PessoaJuridica() {
		
	}
	
	
	
	public PessoaJuridica(String nome, Double rendaAnual, Integer qntdFuncionarios) {
		super(nome, rendaAnual);
		this.qntdFuncionarios = qntdFuncionarios;
	}
	
	

	public Integer getQntdFuncionarios() {
		return qntdFuncionarios;
	}



	public void setQntdFuncionarios(Integer qntdFuncionarios) {
		this.qntdFuncionarios = qntdFuncionarios;
	}



	@Override
	public Double imposto() {
		if (qntdFuncionarios <= 10) {
			return getRendaAnual() * 0.16;
		}else {
			return getRendaAnual() * 0.14;
		}
	}
	
	public String toString() {
		
		
		return String.format("%s: R$ %.2f", getNome(), imposto());
	}
	
	

}
