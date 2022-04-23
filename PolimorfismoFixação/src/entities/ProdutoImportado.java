package entities;

public class ProdutoImportado extends Produto{
	private Double custoImportacao;

	public ProdutoImportado(String nome, Double preco, Double custoImportacao) {
		super(nome, preco);
		this.custoImportacao = custoImportacao;
	}

	public Double getCustoImportacao() {
		return custoImportacao;
	}

	public void setCustoImportacao(Double custoImportacao) {
		this.custoImportacao = custoImportacao;
	}
	
	public Double precoTotal() {
		return preco + custoImportacao;
	}
	
	@Override
	public String etiquetaPreco() {
		
		return String.format("%s R$ %.2f", nome, precoTotal());
		
	}
}
