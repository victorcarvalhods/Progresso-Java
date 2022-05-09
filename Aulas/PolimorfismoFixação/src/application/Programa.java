package application;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.*;

public class Programa {
	
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		List<Produto> produtos = new ArrayList<Produto>();
		
		Scanner sc = new Scanner(System.in);
		char escolha;
		System.out.print("Quantiade de produtos a serem lidos: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <=n ; i++) {
			System.out.println("Dados do produto #" + i);
			System.out.println("Comum, usado ou importado: ");
			escolha = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Preco: ");
			double preco = sc.nextDouble();
			
			if (escolha == 'c') {
				produtos.add(new Produto(nome, preco));
			}else if (escolha == 'u') {
				System.out.print("Data de fabricação (DD/MM/YYYY): ");
				Date data = sdf.parse(sc.next());
				produtos.add(new ProdutoUsado(nome, preco, data));
			}else {
				System.out.print("Custo de importação: ");
				double txI = sc.nextDouble();
				produtos.add(new ProdutoImportado(nome, preco, txI));
			}
			
			
		}
		System.out.println("Etiquetas de preço: ");
		
		for (Produto pX: produtos) {
			System.out.println(pX.etiquetaPreco());
		}
		sc.close();

	}

}
