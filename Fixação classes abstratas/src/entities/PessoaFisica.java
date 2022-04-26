package entities;

public class PessoaFisica extends Pessoa{
	
	private Double custosMedicos;
	
	

	public PessoaFisica(String nome, Double rendaAnual, Double custosMedicos) {
		super(nome, rendaAnual);
		this.custosMedicos = custosMedicos;
	}



	@Override
	public Double imposto() {
		if (getRendaAnual() < 20000.00) {
			return getRendaAnual() * 0.15 - custosMedicos * 0.50;
		}else {
			
			return getRendaAnual() * 0.25 - custosMedicos * 0.50;
		}
		
	}
	
	
	
	public Double getCustosMedicos() {
		return custosMedicos;
	}



	public void setCustosMedicos(Double custosMedicos) {
		this.custosMedicos = custosMedicos;
	}



	public String toString() {
		
		
		return String.format("%s: R$ %.2f", getNome(), imposto());
	}

}
