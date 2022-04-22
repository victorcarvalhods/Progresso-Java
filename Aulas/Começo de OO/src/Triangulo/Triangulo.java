package Triangulo;

public class Triangulo {
	private double l1;
	private double l2;
	private double l3;
	private double area;
	
	public Triangulo(double l1, double l2,double l3) {
		this.l1 = l1;
		this.l2 = l2;
		this.l3 = l3;
		
		this.calcularArea();
	}
	
	public void calcularArea() {
		double p = (l1 + l2 + l3)/2;
		area = Math.sqrt(p * (p-l1) * (p-l2) * (p-l3));
	}

	public double getL1() {
		return l1;
	}

	public void setL1(double l1) {
		this.l1 = l1;
	}

	public double getL2() {
		return l2;
	}

	public void setL2(double l2) {
		this.l2 = l2;
	}

	public double getL3() {
		return l3;
	}

	public void setL3(double l3) {
		this.l3 = l3;
	}

	public double getArea() {
		return area;
	}

	public void setArea() {
		this.calcularArea();;
	}
	
	
	

}
