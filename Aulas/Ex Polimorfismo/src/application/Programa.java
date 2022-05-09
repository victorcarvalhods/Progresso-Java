package application;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.*;

public class Programa {

	public static void main(String[] args) {
		
		List<Funcionario> funcionarios = new ArrayList<Funcionario>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quanto funcionário serão registrados: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < n; i++) {
			
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Horas trabalhadas: ");
			Integer horasT = sc.nextInt();
			System.out.print("Valor por hora: ");
			Double precoHora = sc.nextDouble();
			
			System.out.print("Funcionário terceirizado? s/n ");
			char r = (sc.next()).charAt(0);
			
			if (r == 's') {
				System.out.print("Valor das despesas: ");
				double despesas = sc.nextDouble();
				sc.nextLine();
				
				funcionarios.add(new FuncionarioTerceirizado(nome, horasT, precoHora, despesas));
			}else {
				funcionarios.add(new Funcionario(nome, horasT, precoHora));
			}
			
		}
		
		for (Funcionario func: funcionarios) {
			System.out.println(func.toString());
		}
		
		sc.close();
	}

}
