package application;

import java.util.Scanner;

import entities.UsuarioBanco;

public class Programa {

	public static void main(String[] args) {
		UsuarioBanco cliente;
		String nome;
		int numConta;
		double valorAbertura = -1;
		double valorDeposito;
		double valorSaque;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nome do titular da conta: ");
		nome = sc.nextLine();
		System.out.println("Numero da conta: ");
		numConta = sc.nextInt();
		System.out.println("Deposito de abertura: ");
		System.out.println("Digite 0 caso não tenha sido feito deposito de abertura");
		
		valorAbertura = sc.nextDouble();
		
		
		if (valorAbertura > 0) {
			cliente = new UsuarioBanco(nome, numConta, valorAbertura);
		}else {
			cliente = new UsuarioBanco(nome, numConta);
		}
		
		System.out.println(cliente);
		
		System.out.println("Valor depósito: ");
		valorDeposito = sc.nextDouble();
		cliente.deposito(valorDeposito);
		System.out.println(cliente);
		
		System.out.println("Valor saque: ");
		valorSaque = sc.nextDouble();
		valorSaque += 5;
		cliente.saque(valorSaque);
		System.out.println(cliente);
		
		
		
		
		sc.close();
		

	}

}
