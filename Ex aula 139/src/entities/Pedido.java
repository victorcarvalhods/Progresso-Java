package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.StatusDoPedido;

public class Pedido {
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private Date momento;
	private StatusDoPedido statusDoPedido;
	private List<PedidoItem> itensDoPedido = new ArrayList<>();
	private Cliente cliente;
	

	public Pedido(Date momento, StatusDoPedido statusDoPedido, Cliente cliente) {
		this.momento = momento;
		this.statusDoPedido = statusDoPedido;
		this.cliente = cliente;
	}
	
	public void addItem(PedidoItem item) {
		itensDoPedido.add(item);
	}
	
	public void removeitem(PedidoItem item) {
		itensDoPedido.remove(item);
	}
	
	public Double total() {
		Double soma =  0.00;
		for (PedidoItem pedido : itensDoPedido) {
			soma += pedido.subTotal();
		}
		return soma;
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public StatusDoPedido getStatusDoPedido() {
		return statusDoPedido;
	}

	public void setStatusDoPedido(StatusDoPedido statusDoPedido) {
		this.statusDoPedido = statusDoPedido;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<PedidoItem> getItensDoPedido() {
		return itensDoPedido;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n");
		sb.append("Resumo do pedido: \n");
		sb.append("Momento do pedido: " + sdf.format(momento) + "\n");
		sb.append("Status do pedido: " + statusDoPedido + "\n");
		sb.append("Cliente: " + cliente.toString() + "\n");
		sb.append("Itens pedidos: " + "\n");
		for (PedidoItem pedidoX: itensDoPedido) {
			sb.append(pedidoX.toString());
			sb.append("\n");
		}
		sb.append(String.format("Custo total: R$%.2f", total()));
		
		return sb.toString();
	}
	
	
}
