package application;
import entities.*;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Hotel hotel = new Hotel();
		Aluno aluno;
		String nome, email;
		int numQuarto;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantidade de quartos a serem reservados: ");
		int n = sc.nextInt();
		
		for (int i= 0; i < n; i++) {
			System.out.println("Aluno " + i+1);
			System.out.println("Nome: ");
			nome = sc.next();
			System.out.println("Email: ");
			email = sc.next();
			System.out.println("Quarto de escolha: ");
			numQuarto = sc.nextInt();
			
			sc.nextLine();
			
			aluno = new Aluno(nome, email, numQuarto);
			
			hotel.AlocaQuarto(aluno);
		}
		
		System.out.println(hotel);
		
		sc.close();

	}
}
