package ar.edu.unju.fi.principal;
import java.util.*;
import ar.edu.unju.fi.model.*;

public class Principal3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calendar date1 = new GregorianCalendar(2020,Calendar.APRIL,25);// punto b1
		Calendar date2 = new GregorianCalendar(2009,Calendar.AUGUST,5);
		ProcesoFechaCalendar pfc1 = new ProcesoFechaCalendar(date1,date2);
		Calendar date3 = new GregorianCalendar(2018,Calendar.MAY,15,20,15,10);// punto b2
		Calendar date4 = new GregorianCalendar(2001,Calendar.DECEMBER,13,20,15,10);
		ProcesoFechaCalendar pfc2 = new ProcesoFechaCalendar(date3,date4);
		Calendar birthDate = new GregorianCalendar(2002,Calendar.MARCH,13);// punto b4
		Calendar todayDate = Calendar.getInstance();
		ProcesoFechaCalendar pfc3 = new ProcesoFechaCalendar(birthDate,todayDate);
		
		System.out.println("--PUNTO B1---");
		System.out.println(pfc1.getFecha1().getTime());
		System.out.println(pfc1.getFecha2().getTime());
		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("\n---PUNTO B2---");
		System.out.println(pfc2.getFecha1().getTime());
		System.out.println(pfc2.getFecha2().getTime());
		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("\n---PUNTO B3---");
		System.out.println(pfc2.compararFechas());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("\n---PUNTO B4---");
		System.out.println("Han transcurrido "+pfc3.contarTiempoTranscurrido().get(Calendar.YEAR)+" años desde la fecha "+pfc3.getFecha1().getTime()+" hasta la fecha "+pfc3.getFecha2().getTime());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("\n---PUNTO B5---");
		int anio=0,mes=0,dia=0;
		System.out.println("Ingrese el año (YYYY): ");
		try
		{
			anio=sc.nextInt();
		} catch (InputMismatchException ime) {}
		System.out.println("Ingrese el mes (MM): ");
		try
		{
			mes=sc.nextInt();
		} catch (InputMismatchException ime) {}
		System.out.println("Ingrese el día (DD): ");
		try
		{
			dia=sc.nextInt();
		} catch (InputMismatchException ime) {
			System.out.println("*** ERROR DE FORMATO ***");
			System.out.println("La fecha no se mostrará correctamente..."); //debido a que en realidad no ocurre ninguna excepción en el programa, puse ese mensaje
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		Calendar date5 = new GregorianCalendar(anio,mes-1,dia);
		ProcesoFechaCalendar pfc4 = new ProcesoFechaCalendar();
		pfc4.setFecha1(date5);
		System.out.println(pfc4.formatearFecha());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("\n---PUNTO B6---");
		ProcesoFechaCalendar pfc5 = new ProcesoFechaCalendar();
		pfc5.setFecha1(todayDate);
		System.out.println(pfc5.sumarDias().getTime());
		
		sc.close();
	}

}
