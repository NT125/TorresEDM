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
//		ps.setCadena("Antonio, �lamo, �rea, asilo"); // tiene 4 vocales 'o' y 27 caracteres
//		
//		System.out.println(ps.contarCantidadVocal()); // deber�a marcar todas las 'o' - FUNCIONA
//		System.out.println(ps.reemplazarCaracter()); // deber�a reemplazar todas las 'a' por lo definido en la variable caracter - FUNCIONA
//		System.out.println(ps.eliminarBlancos()); // deber�a borrar los espacios - FUNCIONA
//		System.out.println(ps.determinarLongitud()); // deber�a contar 27 caracteres - FUNCIONA
//		System.out.println("\n");//salto de l�nea
//		ps.setCadena("Logra/Casillas/all�/sacar/gol"); // cadena pal�ndroma, tercer barra en posici�n 20
//		System.out.println(ps.determinarPosici�n()); // deber�a determinar la posici�n de la tercera barra - FUNCIONA
//		System.out.println(ps.determinarPalindromo()); // deber�a determinar si la cadena es de verdad pal�ndroma - FUNCIONA
//		// 									FUNCIONAN TODOS LOS METODOS DEL PUNTO 1
		
//		System.out.println(pf1.contarTiempoTranscurrido().getDays());//deber�a contar los dias transcurridos - FUNCIONA
//		System.out.println(pf1.contarTiempoTranscurrido().getMonths());//lo mismo pero con los meses		 - FUNCIONA
//		System.out.println(pf1.contarTiempoTranscurrido().getYears());// lo mismo pero con los a�os 		 - FUNCIONA
//		
//		System.out.println(pf1.formatearFecha()); // deber�a mostrar "20/02/2020" - FUNCIONA		
//		System.out.println(pf1.compararFechas()); // deber�a decir si la fecha1 es anterior o posterior a la 2 - FUNCIONA
//		System.out.println(pf1.sumarDias()); // deber�a sumar d�as hasta llegar al 13 de mayo - FUNCIONA
//		//									FUNCIONAN TODOS LOS METODOS DEL PUNTO 2
		//							LOS DEL PUNTO 3 TAMBI�N PERO NI TESTE� ESOS PORQUE SOY UN DIOS
		
				
	}

}
