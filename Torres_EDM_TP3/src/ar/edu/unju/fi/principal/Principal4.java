package ar.edu.unju.fi.principal;
import ar.edu.unju.fi.model.*;

public class Principal4 {

	public static void main(String[] args) {
		ProcesoWrappers pw = new ProcesoWrappers();// punto b1
		
		pw.setNumeroEntero1(13);// punto b2
		pw.setNumeroEntero2(20);
		pw.setNumeroDecimal1(13.2);// punto b3
		pw.setNumeroDecimal2(8.5);
		pw.setNumeroString("4");//punto b4
		
		System.out.println("---PUNTO B5---");
		System.out.println("Suma de enteros: "+(pw.calcularSuma()));
		System.out.println("División de decimales: "+pw.calcularDivision());
		System.out.println("Conversión de String a entero: "+pw.convertirNumerico());
		try {
			Thread.sleep(2200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("\n ---PUNTO B6/B7---");
		pw.setNumeroDecimal2(null);
		System.out.println("Suma de enteros: "+(pw.calcularSuma()));
		System.out.println("División de decimales: "+pw.calcularDivision());
		System.out.println("Conversión de String a entero: "+pw.convertirNumerico());
		try {
			Thread.sleep(2200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("\n---PUNTO B8/B9---");
		pw.setNumeroString("20,78");
		System.out.println("Suma de enteros: "+(pw.calcularSuma()));
		System.out.println("División de decimales: "+pw.calcularDivision());
		System.out.println("Conversión de String a entero: "+pw.convertirNumerico());
		try {
			Thread.sleep(2200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
