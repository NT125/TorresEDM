package ar.edu.unju.fi.principal;

import java.text.DecimalFormat;
import java.util.Scanner;
import ar.edu.unju.fi.modelo.*;

public class Principal4 {

	public static void main(String[] args) {
		DecimalFormat formato = new DecimalFormat("#.##"); // Limita la cantidad de decimales a mostrar
		Scanner sc = new Scanner(System.in);
		Cono cono1 = new Cono();
		
		System.out.println("Ingrese la altura del cono: "); cono1.setAltura(sc.nextDouble());
		System.out.println("Ingrese el radio del cono: "); cono1.setRadio(sc.nextDouble());
		
		System.out.println("GENERATRIZ: " + formato.format(cono1.calcularGeneratriz()));
		System.out.println("ÁREA: " + formato.format(cono1.calcularArea()));
		System.out.println("VOLUMEN: " + formato.format(cono1.calcularVolumen()));
		
		sc.close();
	}

}
