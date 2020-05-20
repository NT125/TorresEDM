package ar.edu.unju.fi.principal;
import ar.edu.unju.fi.model.*;
import java.util.Scanner;

public class Principal1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter("\n");
		ProcesoString objString = new ProcesoString();
		
		System.out.println("---PUNTO B1---");
		System.out.println("Ingrese una frase corta: "); objString.setCadena(sc.next());
		System.out.println("Ingrese una vocal: "); objString.setCaracter(sc.next().charAt(0));		
		System.out.println("Hay "+objString.contarCantidadVocal()+" vocales '"+objString.getCaracter()+"' en la frase");
		objString.setCadena("Más vale prevenir que lamentar");
		System.out.println("Hay "+objString.contarCantidadVocal()+" vocales '"+objString.getCaracter()+"' en la frase ''Más vale prevenir que lamentar''\n");
		if (objString.getCaracter()!= 'a' & objString.getCaracter()!= 'e' & objString.getCaracter()!= 'i' & objString.getCaracter()!= 'o' & objString.getCaracter()!= 'u')
		{
			System.out.println("Eso es porque "+objString.getCaracter()+" no es una vocal");
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("\n---PUNTO B2---");
		System.out.println("Ingrese una frase corta: "); objString.setCadena(sc.next());
		System.out.println("Ingrese una vocal: "); objString.setCaracter(sc.next().charAt(0));
		while(objString.getCaracter()!= 'a' & objString.getCaracter()!= 'e' & objString.getCaracter()!= 'i' & objString.getCaracter()!= 'o' & objString.getCaracter()!= 'u')
		{
			System.out.println("Por favor, ingrese una vocal: ");objString.setCaracter(sc.next().charAt(0));
		}
		System.out.println(objString.reemplazarCaracter());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("\n---PUNTO B3---");
		System.out.println("Ingrese una frase corta: "); objString.setCadena(sc.next());
		System.out.println(objString.eliminarBlancos());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("\n---PUNTO B4---");
		System.out.println("Ingrese una frase: "); objString.setCadena(sc.next());
		System.out.println(objString.determinarLongitud());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("\n---PUNTO B5---");
		System.out.println("URL: https://www.fi.unju.edu.ar/secretariaacademica/calendario-academico-2020.html");
		objString.setCadena("https://www.fi.unju.edu.ar/secretariaacademica/calendario-academico-2020.html");
		System.out.println(objString.determinarPosición());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("\n---PUNTO B6---");
		String palindromo;
		System.out.println("Ingrese una frase: "); palindromo = sc.next();
		palindromo = palindromo.substring(0, palindromo.length()-1);
		objString.setCadena(palindromo);
		System.out.println(objString.determinarPalindromo());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		sc.close();
	}
}
