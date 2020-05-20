package ar.edu.unju.fi.principal;
import java.time.*;
import java.util.*;
import ar.edu.unju.fi.model.*;

public class Principal2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		LocalDate date1 = LocalDate.parse("2020-02-20"); //punto b1
		LocalDate date2 = LocalDate.parse("2020-04-24");
		ProcesoFecha pf1 = new ProcesoFecha(date1,date2);
		LocalTime time1 = LocalTime.parse("22:58:45"); //punto b2
		LocalTime time2 = LocalTime.parse("04:20:25");
		ProcesoFecha pf2 = new ProcesoFecha(time1, time2);
		LocalDateTime dateTime1 = LocalDateTime.of(date1, time1); //punto b4
		LocalDateTime dateTime2 = LocalDateTime.of(date2, time2);
		ProcesoFecha pf3 = new ProcesoFecha(dateTime1, dateTime2);
		LocalDate birthDate = LocalDate.parse("2002-03-13"); //punto b5
		LocalDate todayDate = LocalDate.now();
		ProcesoFecha pf4 = new ProcesoFecha(birthDate, todayDate);
		
		System.out.println("---PUNTO B1---");
		System.out.println("Fecha 1: "+pf1.getFecha1());
		System.out.println("Fecha 2: "+pf1.getFecha2());
		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("\n---PUNTO B2---");
		System.out.println("Hora 1: "+pf2.getTime1());
		System.out.println("Hora 2: "+pf2.getTime2());
		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("\n---PUNTO B3---");
		System.out.println(pf1.compararFechas());
		try {
			Thread.sleep(3100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("\n---PUNTO B4---");
		System.out.println("Fecha y Hora 1: "+pf3.getDateTime1());
		System.out.println("Fecha y Hora 2: "+pf3.getDateTime2());
		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("\n---PUNTO B5---");
		System.out.println("Han transcurrido "+pf4.contarTiempoTranscurrido().getYears()+" años, "+pf4.contarTiempoTranscurrido().getMonths()+" meses y "+pf4.contarTiempoTranscurrido().getDays()+" días desde la fecha "+pf4.getFecha1()+" hasta la fecha "+pf4.getFecha2());
		try {
			Thread.sleep(2900);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("\n---PUNTO B6---");
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
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		ProcesoFecha pf5 = new ProcesoFecha();
		try {
			pf5.setFecha1(LocalDate.of(anio, mes, dia));

			System.out.println(pf5.formatearFecha());
		}catch(DateTimeException e) {System.out.println("La fecha contiene datos inválidos, no se mostrará");}
		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("\n---PUNTO B7---");
		ProcesoFecha pf6 = new ProcesoFecha();
		pf6.setFecha1(todayDate);
		System.out.println(pf6.sumarDias());
		
		sc.close();
	}

}
