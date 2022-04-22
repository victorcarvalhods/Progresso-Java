package application;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.*;
import entities.enums.*;

public class Programa {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		
		Pedido pedido;
		
		System.out.println("Entre com os dados do cliente: ");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Data aniversário (DD/MM/YYYY): ");
		Date aniversario = sdf.parse(sc.next());
		
		Cliente cliente = new Cliente(nome, email, aniversario);
		
		System.out.println("Entre com os dados do pedido: ");
		System.out.print("Status: ");
		StatusDoPedido status = StatusDoPedido.valueOf(sc.next());
		pedido = new Pedido(new Date(), status, cliente);
		System.out.print("Quantidade de itens para esse pedido? ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Entre com os dados do item " + i + ":");
			System.out.print("Nome do produto: ");
			String nomeP = sc.next();
			System.out.print("Preço do produto: ");
			double preco = sc.nextDouble();
			Produto produto = new Produto(nomeP, preco);
			
			System.out.print("Quantidade: ");
			int quantidade = sc.nextInt();
			
			PedidoItem pedido1 = new PedidoItem(quantidade, preco, produto);
			
			pedido.addItem(pedido1);
		}
		
		System.out.println(pedido);
		
		sc.close();
		

	}

}
