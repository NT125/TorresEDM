package ar.edu.unju.fi.principal;

import java.util.Scanner;

public class Principal5a {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("Ingrese un n�mero");
		
		num = sc.nextInt();
		
		if(num >= 0) System.out.println("El n�mero es POSITIVO");
		else System.out.println("El n�mero es NEGATIVO");
		
		sc.close();
	}

}
