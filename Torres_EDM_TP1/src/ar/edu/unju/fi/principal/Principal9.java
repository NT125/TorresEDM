package ar.edu.unju.fi.principal;

import java.util.Scanner;
import ar.edu.unju.fi.model.Rect�ngulo;

public class Principal9 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		Rect�ngulo unRectangulo = new Rect�ngulo();
		
		int b,h;
		
		System.out.println("BASE: ");
		b = sc.nextInt();
		System.out.println("ALTURA: ");
		h = sc.nextInt();
		System.out.println();
		
		System.out.println("�REA: "+unRectangulo.area(b,h));
		System.out.println("PER�METRO: "+unRectangulo.perimetro(b, h));
		
		sc.close();
	}

}
