package ar.edu.unju.fi.principal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

//import java.util.Scanner;
import ar.edu.unju.fi.model.*;

public class testing {

	public static void main(String[] args) {
		ProcesoString ps = new ProcesoString();
		//
		LocalDate date1 = LocalDate.parse("2020-02-20");
		LocalDate date2 = LocalDate.parse("2020-04-24");
		ProcesoFecha pf1 = new ProcesoFecha(date1,date2);
		//
		
//		ps.setCaracter('o');		
//		ps.setCadena("Antonio, Álamo, área, asilo"); // tiene 4 vocales 'o' y 27 caracteres
//		
//		System.out.println(ps.contarCantidadVocal()); // debería marcar todas las 'o' - FUNCIONA
//		System.out.println(ps.reemplazarCaracter()); // debería reemplazar todas las 'a' por lo definido en la variable caracter - FUNCIONA
//		System.out.println(ps.eliminarBlancos()); // debería borrar los espacios - FUNCIONA
//		System.out.println(ps.determinarLongitud()); // debería contar 27 caracteres - FUNCIONA
//		System.out.println("\n");//salto de línea
//		ps.setCadena("Logra/Casillas/allí/sacar/gol"); // cadena palíndroma, tercer barra en posición 20
//		System.out.println(ps.determinarPosición()); // debería determinar la posición de la tercera barra - FUNCIONA
//		System.out.println(ps.determinarPalindromo()); // debería determinar si la cadena es de verdad palíndroma - FUNCIONA
//		// 									FUNCIONAN TODOS LOS METODOS DEL PUNTO 1
		
//		System.out.println(pf1.contarTiempoTranscurrido().getDays());//debería contar los dias transcurridos - FUNCIONA
//		System.out.println(pf1.contarTiempoTranscurrido().getMonths());//lo mismo pero con los meses		 - FUNCIONA
//		System.out.println(pf1.contarTiempoTranscurrido().getYears());// lo mismo pero con los años 		 - FUNCIONA
//		
//		System.out.println(pf1.formatearFecha()); // debería mostrar "20/02/2020" - FUNCIONA		
//		System.out.println(pf1.compararFechas()); // debería decir si la fecha1 es anterior o posterior a la 2 - FUNCIONA
//		System.out.println(pf1.sumarDias()); // debería sumar días hasta llegar al 13 de mayo - FUNCIONA
//		//									FUNCIONAN TODOS LOS METODOS DEL PUNTO 2
		//							LOS DEL PUNTO 3 TAMBIÉN PERO NI TESTEÉ ESOS PORQUE SOY UN DIOS
		
				
	}

}
