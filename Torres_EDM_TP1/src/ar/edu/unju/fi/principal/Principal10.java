package ar.edu.unju.fi.principal;

import java.util.Scanner;
import ar.edu.unju.fi.model.Tri�ngulo;

public class Principal10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int a,b,c,h;
		
		Tri�ngulo unTriangulo = new Tri�ngulo();
		
		System.out.println("LONGITUD LADO A: ");
		a=sc.nextInt();
		System.out.println("LONGITUD LADO B: ");
		b=sc.nextInt();
		System.out.println("LONGITUD LADO C: ");
		c=sc.nextInt();
		System.out.println("ALTURA: ");
		h=sc.nextInt();
		System.out.println();
		
		System.out.println("�REA: "+unTriangulo.area(b, h));
		System.out.println("PER�METRO: "+unTriangulo.perimetro(a, b, c));
		sc.close();
	}
}
