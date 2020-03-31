package ar.edu.unju.fi.principal;

import java.util.Scanner;


public class Principal3 {
	
	public static void main (String [] args)
	{
		Scanner sc = new Scanner(System.in);
		
		String nombre;
		int edad;
		float estatura;
		char letra;
		
		System.out.println("Ingrese su nombre completo: ");
		nombre =sc.nextLine();
		System.out.println("Ingrese su edad: ");
		edad = sc.nextInt();
		System.out.println("Ingrese su estatura: ");
		estatura = sc.nextFloat();
		System.out.println("Ingrese una letra: ");
		letra = sc.next().charAt(0);
		System.out.println("NOMBRE: " + nombre);
		System.out.println("EDAD: " + edad);
		System.out.println("ESTATURA: " + estatura);
		System.out.println("LETRA ESCOGIDA: " + letra);
		
		sc.close();
	}

}
