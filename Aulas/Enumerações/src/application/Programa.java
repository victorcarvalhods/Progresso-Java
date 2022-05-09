package application;

import java.util.Date;

import entities.Pedido;
import entities.enums.StatusPedido;

public class Programa {

	public static void main(String[] args) {
		
		Pedido pedido = new Pedido(1111, new Date(), StatusPedido.AGUARDANDO_PAGAMENTO);
		
		
		System.out.println(pedido);
		
		StatusPedido os1 = StatusPedido.ENTREGUE;
		StatusPedido os2 = StatusPedido.valueOf("ENTREGUE");
		
		System.out.println(os1);
		System.out.println(os2);
		

	}

}
