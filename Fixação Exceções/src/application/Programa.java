package application;

import java.util.Scanner;

import model.Exception.DomainException;
import model.entities.Conta;

public class Programa {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Conta conta;
		
		System.out.println("Entre com os dados da conta: ");
		try {
			System.out.print("Numero da conta: ");
			int numeroConta = sc.nextInt();
			sc.nextLine();
			System.out.print("Titular da conta: ");
			String nome = sc.nextLine();
			System.out.print("Saldo inicial: ");
			double saldo = sc.nextDouble();
			System.out.print("Limite saque: ");
			double limiteSaque = sc.nextDouble();
			
			conta = new Conta(numeroConta, nome, saldo, limiteSaque);
			
			System.out.println();
			System.out.print("Valor para saque: ");
			double saque = sc.nextDouble();
			
			conta.saque(saque);
			System.out.println("Novo saldo: R$" + conta.getSaldo());
		}
		catch(DomainException e) {
			System.out.println(e.getMessage());
		}
		
		sc.close();
	}

}
