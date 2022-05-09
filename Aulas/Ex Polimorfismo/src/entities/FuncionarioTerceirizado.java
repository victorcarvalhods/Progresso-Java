package entities;

public class FuncionarioTerceirizado extends Funcionario {
	
	private double despesaAdicional;

	public FuncionarioTerceirizado(String nome, Integer horasDeTrabalho, Double valorPorHora, double despesaAdicional) {
		super(nome, horasDeTrabalho, valorPorHora);
		this.despesaAdicional = despesaAdicional;
	}
	
	
	/*
	 * por conta do funcionario terceirizado receber
	 * um bonus de 110%, correspondente a sua despesa,
	 * eu pensei em criar uma função para calcular o bonus
	 * e sobrescrever o método pagamento para retornar
	 * o salário normal + o bônus*/
	
	public double bonus() {
		return despesaAdicional * 1.1;
	}

	@Override
	public double pagamento() {

		return super.pagamento() + bonus();
	}


	public double getDespesaAdicional() {
		return despesaAdicional;
	}


	public void setDespesaAdicional(double despesaAdicional) {
		this.despesaAdicional = despesaAdicional;
	}
	
	
	

}
