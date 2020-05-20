package ar.edu.unju.fi.principal;

import java.util.Scanner;
import java.text.DecimalFormat;
import ar.edu.unju.fi.modelo.ConversorTemperatura;

public class Principal3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ConversorTemperatura conversor = new ConversorTemperatura();
		DecimalFormat formato = new DecimalFormat("#.##");
		
		int opt = 1;
		
		while (opt!=0) {
			try {
				System.out.println("-- Elija una opción --");
				System.out.println("1 - Convertir de Fareinheit a Celsius");
				System.out.println("2 - Convertir de Celsius a Fareinheit");
				System.out.println("3 - Convertir de Kelvin a Celsius");
				System.out.println("4 - Convertir de Celsius a Kelvin");
				System.out.println("5 - Convertir de Kelvin a Fareinheit");
				System.out.println("6 - Convertir de Fareinheit a Kelvin");
				System.out.println("0 - Salir");
				opt = sc.nextInt();
				
				if (opt > 0 && opt <=6) {
					System.out.println("\nIngrese la Temperatura: ");
					conversor.setTemperatura(sc.nextInt());
				}
				
				switch(opt) {
				case 1 : System.out.println(conversor.getTemperatura()+"°F son "+formato.format(conversor.convertirFareinheitACelsius())+"°C");break;
				case 2 : System.out.println(conversor.getTemperatura()+"°C son "+formato.format(conversor.convertirCelsiusAFareinheit())+"°F");break;
				case 3 : System.out.println(conversor.getTemperatura()+"°K son "+formato.format(conversor.convertirKelvinACelsius())+"°C");break;
				case 4 : System.out.println(conversor.getTemperatura()+"°C son "+formato.format(conversor.convertirCelsiusAKelvin())+"°K");break;
				case 5 : System.out.println(conversor.getTemperatura()+"°K son "+formato.format(conversor.convertirKelvinAFareinheit())+"°F");break;
				case 6 : System.out.println(conversor.getTemperatura()+"°F son "+formato.format(conversor.convertirFareinheitAKelvin())+"°K");break;
				case 0 : System.out.println("\nSaliendo...");break;
				default : {
					System.out.println("\n---------------");
					System.out.println("Opción inválida");
					System.out.println("---------------\ns");
					}
				}
			}catch(Exception ex) {
				System.out.println("\n------------------");
				System.out.println(" ERROR DE INGRESO ");
				System.out.println("------------------\n");
				sc.next();
			}
		}
		sc.close();	
	}
}


















//switch(opt) {
//case 1 : System.out.println(conversor.getTemperatura()+"°F son "+conversor.convertirFareinheitACelsius()+"°C");break;
//case 2 : System.out.println(conversor.getTemperatura()+"°C son "+conversor.convertirCelsiusAFareinheit()+"°F");break;
//case 3 : System.out.println(conversor.getTemperatura()+"°K son "+conversor.convertirKelvinACelsius()+"°C");break;
//case 4 : System.out.println(conversor.getTemperatura()+"°C son "+conversor.convertirCelsiusAKelvin()+"°K");break;
//case 5 : System.out.println(conversor.getTemperatura()+"°K son "+conversor.convertirKelvinAFareinheit()+"°F");break;
//case 6 : System.out.println(conversor.getTemperatura()+"°F son "+conversor.convertirFareinheitAKelvin()+"°K");break;
//case 0 : System.out.println("Saliendo...");break;
//default : System.out.println("Opción inválida");
