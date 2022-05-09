package entities;

import entities.enums.Cor;

public class Retangulo extends Forma{

	private Double altura;
	private Double largura;
	
	public Retangulo() {
		
	}
	
	public Retangulo(Double altura, Double largura, Cor cor) {
		super(cor);
		this.altura = altura;
		this.largura = largura;
	}

	

	public Double getAltura() {
		return altura;
	}



	public void setAltura(Double altura) {
		this.altura = altura;
	}



	public Double getLargula() {
		return largura;
	}



	public void setLargula(Double largula) {
		this.largura = largula;
	}



	@Override
	public double area() {
		
		return altura*largura;
	}

}
