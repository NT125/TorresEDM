package ar.edu.unju.fi.principal;

import java.util.Scanner;
import ar.edu.unju.fi.model.Rectángulo;

public class Principal9 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		Rectángulo unRectangulo = new Rectángulo();
		
		int b,h;
		
		System.out.println("BASE: ");
		b = sc.nextInt();
		System.out.println("ALTURA: ");
		h = sc.nextInt();
		System.out.println();
		
		System.out.println("ÁREA: "+unRectangulo.area(b,h));
		System.out.println("PERÍMETRO: "+unRectangulo.perimetro(b, h));
		
		sc.close();
	}

}
