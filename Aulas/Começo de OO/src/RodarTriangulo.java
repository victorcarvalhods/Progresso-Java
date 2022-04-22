import java.util.Scanner;

import Triangulo.*;

public class RodarTriangulo {

	public static void main(String[] args) {
		Triangulo x, y;
		double l1, l2, l3;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira os valores dos lados do triangulo x: ");
		l1 = sc.nextDouble();
		l2 = sc.nextDouble();
		l3 = sc.nextDouble();
		x = new Triangulo(l1,l2,l3);
		System.out.println("Insira os valores dos lados do triangulo y: ");
		l1 = sc.nextDouble();
		l2 = sc.nextDouble();
		l3 = sc.nextDouble();
		y = new Triangulo(l1,l2,l3);
		
		
		Triangulo maiorArea = (x.getArea() > y.getArea()) ? x : y;
		
		System.out.printf("%.2f", maiorArea.getArea());
		

	}

}
