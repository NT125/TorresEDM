package ar.edu.unju.fi.modelo;

public class Cono {
	
	private double altura;
	private double radio;
	
	public Cono() {
		
	}

	public Cono(double altura, double radio) {
		super();
		this.altura = altura;
		this.radio = radio;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	public double calcularGeneratriz() {
		return Math.sqrt(Math.pow(getAltura(), 2)+Math.pow(getRadio(),2));
	}
	
	public double calcularArea() {
		return Math.PI*getRadio()*(calcularGeneratriz()+getRadio());
	}
	
	public double calcularVolumen() {
		return (1d/3)*Math.PI*Math.pow(getRadio(), 2)*getAltura();
	}

}
