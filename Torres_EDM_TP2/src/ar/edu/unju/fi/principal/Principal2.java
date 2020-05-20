package ar.edu.unju.fi.principal;

import java.util.Scanner;
import ar.edu.unju.fi.modelo.*;

public class Principal2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CalculoMatematico calculos = new CalculoMatematico();
		
		System.out.println("Ingrese un número:"); calculos.setNumero(sc.nextInt());
		System.out.println("¿ES NÚMERO PRIMO?:"); calculos.calcularPrimos(calculos.getNumero());
		System.out.println("FACTORIAL: " + calculos.calcularFactorial(calculos.getNumero()));
		System.out.println("COMBINATORIA CON 2: "+calculos.calcularCombinatoria(calculos.getNumero()));
		
		sc.close();
	}

}
