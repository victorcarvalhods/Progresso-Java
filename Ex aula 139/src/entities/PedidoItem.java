package entities;

public class PedidoItem {
	private Integer quantidade;
	private Double preco;
	private Produto produto;
	
	public PedidoItem() {
		
	}
	
	public PedidoItem(Integer quantidade, Double preco, Produto produto) {
		super();
		this.quantidade = quantidade;
		this.preco = preco;
		this.produto = produto;
	}
	
	public Double subTotal() {
		return quantidade*preco;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(produto.getNome() + ",");
		sb.append(String.format(" R$%.2f, ", preco));
		sb.append("Quantidade: " + quantidade);
		sb.append(String.format(", Subtotal: R$%.2f", subTotal()));
		
		return sb.toString();
	}
	
}
