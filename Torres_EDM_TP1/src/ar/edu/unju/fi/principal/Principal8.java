package ar.edu.unju.fi.principal;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Principal8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double v,r,h;
		
		System.out.println("Ingrese el radio del cono");
		r = sc.nextDouble();
		System.out.println("Ingrese la altura del cono");
		h = sc.nextDouble();
		
		v=((1d/3)*Math.PI*Math.pow(r, 2)*h);
		
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.println("El volumen del cono es de: "+df.format(v));
		
		sc.close();
	}

}
