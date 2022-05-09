package application;
import entities.*;

public class Programa {
	
	public static void main(String[] args) {
		//Conta acc1 = new Conta(111, "cleiton", 1000.0);
		Conta acc2 = new ContaNegocios(2222, "jorge", 210.0, 350.0);
		Conta acc3 = new ContaPoupanca(333, "MARIA", 3000.0, 0.02);
	}
}
