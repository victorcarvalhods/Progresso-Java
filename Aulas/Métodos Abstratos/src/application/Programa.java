package application;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.*;
import entities.enums.*;
public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Forma> formas = new ArrayList<>();
		
		System.out.print("Número de formas a serem lidas: ");
		int n = sc.nextInt();
		
		for (int i =1; i <=n; i++) {
			System.out.println("Dados da forma " + i);
			System.out.print("Retangulo ou circulo (r/c): ");
			char escolha = sc.next().toLowerCase().charAt(0);
			sc.nextLine();
			System.out.print("Cor (AZUL, VERMELHO, PRETO): ");
			Cor cor = Cor.valueOf(sc.next().toUpperCase());
			
			if (escolha == 'r') {
				System.out.print("Altura: ");
				double altura = sc.nextDouble();
				System.out.print("Largura: ");
				double largura = sc.nextDouble();
				
				formas.add(new Retangulo(altura, largura, cor));
			}else {
				System.out.print("Raio: ");
				double raio = sc.nextDouble();
				
				formas.add(new Circulo(cor, raio));
			}
		}
		
		System.out.println("Area das formas: ");
		for (Forma f: formas) {
			System.out.printf("%.2f\n", f.area());
		}
		
		sc.close();

	}

}
