package application;

import entities.*;

public class Programa {

	public static void main(String[] args) {
		
		Conta acc = new Conta(1111, "pedro", 1225.20);
		ContaPoupanca nacc = new ContaPoupanca(2222, "joge", 85.75, 0.01);
		ContaNegocios acc3 = new ContaNegocios(22222, "cleitor", 100.0, 1300.0);
		
		System.out.println(acc.getSaldo() + " " + nacc.getSaldo() + " " + acc3.getSaldo());
		
		acc.saque(25.2);
		nacc.saque(5.75);
		acc3.saque(3.0);
		
		System.out.println(acc.getSaldo() + " " + nacc.getSaldo()+ " " + acc3.getSaldo());
		
		
	}

}
