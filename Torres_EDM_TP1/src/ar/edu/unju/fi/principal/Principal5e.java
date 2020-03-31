package ar.edu.unju.fi.principal;

import java.util.Scanner;

public class Principal5e {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int hora;
		
		System.out.println("Ingrese una hora del día (formato 24 hs)");
		hora = sc.nextInt();
		
		if(hora >= 6 && hora <= 12) System.out.println("Buenos Días");
		if(hora >= 13 && hora <= 20) System.out.println("Buenas Tardes");
		if(hora >=21 && hora < 24) System.out.println("Buenas Noches");
		if((hora <=5 || hora == 0) && hora < 6) System.out.println("Buenas Noches");
		if (hora < 0 || hora > 23) System.out.println("Valor no válido");
		
		sc.close();
	}

}
