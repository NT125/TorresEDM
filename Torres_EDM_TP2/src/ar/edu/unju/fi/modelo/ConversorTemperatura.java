package ar.edu.unju.fi.modelo;

public class ConversorTemperatura {
	int temperatura;
	
	public ConversorTemperatura() {}

	public ConversorTemperatura(int temperatura) {
		super();
		this.temperatura = temperatura;
	}

	public int getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}
	
	public double convertirFareinheitACelsius() {
		return (5*(getTemperatura()-32))/9;
	}
	
	public double convertirCelsiusAFareinheit() {
		return ((9*getTemperatura())/5)+32;
	}
	
	public double convertirKelvinACelsius() {
		return getTemperatura()-273.15;
	}
	
	public double convertirCelsiusAKelvin() {
		return getTemperatura()+273.15;
	}
	
	public double convertirKelvinAFareinheit() {
		return (9*(getTemperatura()-273.15)/5)+32;
	}
	
	public double convertirFareinheitAKelvin() {
		return (5*(getTemperatura()-32)/9)+273.15;
	}
}
