package ar.edu.unju.fi.principal;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		double h, t, g=9.81;
		
		System.out.println("Ingrese un valor para ''h''");
		h = sc.nextDouble();
		
		t = Math.sqrt((2*h)/g);
		
		DecimalFormat df = new DecimalFormat("#.00");// Para que el resultado no salga con muchos decimales
		
		System.out.println("Un objeto que cae desde "+h+"cm de altura tardará "+df.format(t)+" segundos en caer");
		
		
		sc.close();
		
	}

}
