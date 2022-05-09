package application;
import java.util.Scanner;

import entities.*;

public class Programa {

	public static void main(String[] args) {
		Retangulo retangulo;
		double altura, largura;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira a largura e altura: ");
		altura = sc.nextDouble();
		largura = sc.nextDouble();
		retangulo = new Retangulo(largura, altura);
		
		System.out.println("Area: " + retangulo.Area() 
				+ "\n" 
				+ "perimetro: "+ retangulo.Perimetro() 
				+ "\n" 
				+"Diagonal: "+retangulo.Diagonal());
		sc.close();
	}

}
