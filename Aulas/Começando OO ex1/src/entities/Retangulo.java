package entities;

public class Retangulo {
	private double largura;
	private double altura;
	
	public Retangulo(double largura, double altura) {
		this.largura = largura;
		this.altura = altura;
	}
	
	public double Area() {
		return largura*altura;
	}
	
	public double Perimetro() {
		return largura *2 + altura *2;
	}
	
	public double Diagonal() {
		return Math.sqrt(altura*altura + largura*largura);
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
	

}
