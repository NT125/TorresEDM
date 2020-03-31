package ar.edu.unju.fi.principal;

import java.util.Scanner;

public class Principal5d {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int mes;
		
		System.out.println("Ingrese un número entre 1 y 12");
		mes = sc.nextInt();
		
		if (mes == 1) System.out.println("ENERO");
		if (mes == 2) System.out.println("FEBRERO");
		if (mes == 3) System.out.println("MARZO");
		if (mes == 4) System.out.println("ABRIL");
		if (mes == 5) System.out.println("MARZO");
		if (mes == 6) System.out.println("JUNIO");
		if (mes == 7) System.out.println("JULIO");
		if (mes == 8) System.out.println("AGOSTO");
		if (mes == 9) System.out.println("SEPTIEMBRE");
		if (mes == 10) System.out.println("OCTUBRE");
		if (mes == 11) System.out.println("NOVIEMBRE");
		if (mes == 12) System.out.println("DICIEMBRE");
		if (mes < 1 || mes > 12) System.out.println("Valor no válido");
		
		sc.close();
		
	}

}