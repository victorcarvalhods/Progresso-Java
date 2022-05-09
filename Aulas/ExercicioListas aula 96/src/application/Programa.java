package application;
import entities.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Programa {

	public static void main(String[] args) {
		
		Funcionario funcionario;
		List<Funcionario> trabalhadores = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		int n;
		
		int id;
		String nome;
		double salario;
		
		System.out.println("Quantos funcionários serão registrados? ");
		n = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Funcionário #" + (i+1));
			System.out.println("Id: ");
			id = sc.nextInt();
			sc.nextLine();
			System.out.println("Nome: ");
			nome = sc.nextLine();
			System.out.println("Salário: ");
			salario = sc.nextDouble();
			
			trabalhadores.add(funcionario = new Funcionario(id, nome, salario));
		}
		float aumento;
		System.out.println("Qual o id do funcionário que vai receber o aumento: ");
		int id2 = sc.nextInt();
		System.out.println("Porcentagem de aumento: ");
		aumento = sc.nextFloat();
		
		Funcionario funcionarioAumento = trabalhadores.stream().filter(x -> x.getId() == id2).findFirst().orElse(null);
		
		if (funcionarioAumento.getNome() == null) {
			System.out.println("Funcionário n existe");
		}else funcionarioAumento.aumento(aumento);
		
		for (Funcionario x : trabalhadores) {
			System.out.println(x);
		}
		
		
		
		sc.close();
	}

}
