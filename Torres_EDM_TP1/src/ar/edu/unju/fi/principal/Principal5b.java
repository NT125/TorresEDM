package ar.edu.unju.fi.principal;

import java.util.Scanner;

public class Principal5b {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int edad, c=0, valido;
		
		while (c!=5)
		{
			valido=1;
			edad = sc.nextInt();

			if (edad <1 || edad >100) {valido=0; System.out.println("Edad no Permitida");}
			if (edad >=1 && edad <= 12) System.out.println("Es un niño");
			if (edad >= 13 && edad <= 20) System.out.println("Es un joven");
			if (edad >=21 && edad <=100) System.out.println("Es un adulto");
			if (valido==1) c++;
			
			sc.close();
		}
	}

}
