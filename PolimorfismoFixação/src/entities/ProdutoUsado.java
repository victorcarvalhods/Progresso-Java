package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoUsado extends Produto{
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private Date dataFabricacao;

	public ProdutoUsado(String nome, Double preco, Date dataFabricacao) {
		super(nome, preco);
		this.dataFabricacao = dataFabricacao;
	}

	@Override
	public String etiquetaPreco() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(nome + "(usado) ");
		sb.append(String.format("R$ %.2f", preco));
		sb.append(" (Data de fabricação: )" + sdf.format(dataFabricacao));
		
		
		return sb.toString();
	}
	
	

}
