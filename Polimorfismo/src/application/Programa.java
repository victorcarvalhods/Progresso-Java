package application;

import entities.*;

public class Programa {

	public static void main(String[] args) {
		
		Conta acc = new Conta(1111, "pedro", 1225.20);
		Conta acc2 = new ContaPoupanca(5555, "carla", 125.5, 0.05);
		//Conta normal tem uma taxa de 5 reias para saque
		//Enquanto a poupança não tem.
		//Teste simples do polimorfismo
		acc.saque(50);
		acc2.saque(5.5);
		
		System.out.println(acc.getSaldo() + " " + acc2.getSaldo());
		
	}

}
