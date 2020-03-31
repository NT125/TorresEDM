package ar.edu.unju.fi.principal;

import java.util.Scanner;

public class Principal5a {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("Ingrese un número");
		
		num = sc.nextInt();
		
		if(num >= 0) System.out.println("El número es POSITIVO");
		else System.out.println("El número es NEGATIVO");
		
		sc.close();
	}

}
