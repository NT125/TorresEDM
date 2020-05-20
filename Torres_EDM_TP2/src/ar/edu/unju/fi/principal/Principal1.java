package ar.edu.unju.fi.principal;

import java.util.Scanner;
import ar.edu.unju.fi.modelo.Mascota;

public class Principal1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Mascota mascota1 = new Mascota();
		Mascota mascota2= new Mascota("Greta", "Felino", 3, 4.8);
		
		System.out.println("INGRESE LOS DATOS DE SU MASCOTA");
		System.out.println("Nombre: "); mascota1.setNombre(sc.nextLine());
		System.out.println("Edad:"); mascota1.setEdad(sc.nextInt());
		System.out.println("Peso: "); mascota1.setPeso(sc.nextDouble());
		System.out.println("Tipo: "); mascota1.setTipo(sc.next());
		
		System.out.println(mascota1.mostrarDatosMascota());
		System.out.println("\n Mascota N° 2: ");
		System.out.println(mascota2.mostrarDatosMascota());
		System.out.println();
		
				
		sc.close();		
	}

}
