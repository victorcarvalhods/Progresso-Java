package application;
import java.util.Scanner;

import entities.*;

public class Programa {

	public static void main(String[] args) {
		Product produto;
		String nome;
		double preco;
		int quantidadeEstoque;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira os dados do produto");
		System.out.print("Nome: ");
		nome = sc.nextLine();
		System.out.print("Preço: ");
		preco = sc.nextDouble();
		System.out.print("Quantidade no Estoque: ");
		quantidadeEstoque = sc.nextInt(); 
		System.out.println();
		produto = new Product(nome, preco, quantidadeEstoque);
		
		System.out.println(produto);
		
		System.out.print("Quantidade de produtos para serem adicionados ao estoque: ");
		produto.AdicionarNoEstoque(sc.nextInt());
		
		System.out.println(produto);
		System.out.print("Quantidade de produtos para serem removidos do estoque: ");
		produto.RemoverProdutos(sc.nextInt());
		System.out.println(produto);
		
		sc.close();
		
		
		

	}

}
