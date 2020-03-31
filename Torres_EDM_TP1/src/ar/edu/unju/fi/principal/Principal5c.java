package ar.edu.unju.fi.principal;

import java.util.Scanner;

public class Principal5c {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int mes;
		
		System.out.println("Ingrese un número entre 1 y 12");
		mes = sc.nextInt();
		
		switch(mes)
		{
		case 1 : System.out.println("ENERO"); break;
		case 2 : System.out.println("FEBRERO"); break;
		case 3 : System.out.println("MARZO"); break;
		case 4 : System.out.println("ABRIL"); break;
		case 5 : System.out.println("MAYO"); break;
		case 6 : System.out.println("JUNIO"); break;
		case 7 : System.out.println("JULIO"); break;
		case 8 : System.out.println("AGOSTO"); break;
		case 9 : System.out.println("SEPTIEMBRE"); break;
		case 10 : System.out.println("OCTUBRE"); break;
		case 11 : System.out.println("NOVIEMBRE"); break;
		case 12 : System.out.println("DICIEMBRE"); break;
		default : System.out.println("Valor no Válido"); break;
		}
		
		sc.close();		
	}

}
