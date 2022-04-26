package application;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.*;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Pessoa> pagadores = new ArrayList<>();
		
		System.out.print("Quantidade de registro do Imposto: ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("Dados da pessoa " + i + ":");
			System.out.println("Pessoa fisica ou juridica? (f/j): ");
			char escolha = sc.next().toLowerCase().charAt(0);
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Renda anual: ");
			double renda = sc.nextDouble();
			
			if (escolha == 'f') {
				System.out.print("Custos de saúde: R$ ");
				double custos = sc.nextDouble();
				
				pagadores.add(new PessoaFisica(nome, renda, custos));
			}else {
				System.out.print("Quantidade de funcionários: ");
				int funcionarios = sc.nextInt();
				
				pagadores.add(new PessoaJuridica(nome, renda, funcionarios));
			}
			
		}
		System.out.println("Valores do imposto: ");
		for (Pessoa p: pagadores) {
			System.out.println(p.toString());
		}
		
		sc.close();
	}

}
