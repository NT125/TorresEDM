package ar.edu.unju.fi.model;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class ProcesoFecha {
	private LocalDate fecha1, fecha2;
	private LocalTime time1, time2;
	private LocalDateTime dateTime1, dateTime2;
	
	public ProcesoFecha() {}

	public ProcesoFecha(LocalDate fecha1, LocalDate fecha2) {
		super();
		this.fecha1 = fecha1;
		this.fecha2 = fecha2;
	}

	public ProcesoFecha(LocalTime time1, LocalTime time2) {
		super();
		this.time1 = time1;
		this.time2 = time2;
	}

	public ProcesoFecha(LocalDateTime dateTime1, LocalDateTime dateTime2) {
		super();
		this.dateTime1 = dateTime1;
		this.dateTime2 = dateTime2;
	}

	public LocalDate getFecha1() {
		return fecha1;
	}

	public void setFecha1(LocalDate fecha1) {
		this.fecha1 = fecha1;
	}

	public LocalDate getFecha2() {
		return fecha2;
	}

	public void setFecha2(LocalDate fecha2) {
		this.fecha2 = fecha2;
	}

	public LocalTime getTime1() {
		return time1;
	}

	public void setTime1(LocalTime time1) {
		this.time1 = time1;
	}

	public LocalTime getTime2() {
		return time2;
	}

	public void setTime2(LocalTime time2) {
		this.time2 = time2;
	}

	public LocalDateTime getDateTime1() {
		return dateTime1;
	}

	public void setDateTime1(LocalDateTime dateTime1) {
		this.dateTime1 = dateTime1;
	}

	public LocalDateTime getDateTime2() {
		return dateTime2;
	}

	public void setDateTime2(LocalDateTime dateTime2) {
		this.dateTime2 = dateTime2;
	}
	
	public Period contarTiempoTranscurrido()
	{
		return Period.between(getFecha1(), getFecha2());
	}
	
	public String formatearFecha()
	{
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/YYYY");
		return getFecha1().format(formato);
	}
	
	public String compararFechas()
	{
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/YYYY");
		String respuesta;
		if(getFecha1().compareTo(getFecha2()) > 0) //.compareTo() retorna un número entero positivo o negativo dependiendo si la primer fecha es posteri
		{										   // retorna 0 si las fechas son idénticas
			respuesta="La fecha "+getFecha1().format(formato).toString()+" es posterior a la fecha "+getFecha2().format(formato).toString();
		}
		else
		{
			if (getFecha1().compareTo(getFecha2()) < 0)
			{
				respuesta="La fecha "+getFecha1().format(formato).toString()+" es anterior a la fecha "+getFecha2().format(formato).toString();
			}
			else
			{
				respuesta="Las fechas son idénticas";
			}
		}
		return respuesta;
	}
	
	public LocalDate sumarDias()
	{
		LocalDate fechaObjetivo = LocalDate.parse("2020-05-13");
		int cont=0;
		
		while (getFecha1().isBefore(fechaObjetivo))
		{
			setFecha1(getFecha1().plusDays(1));
			cont++;
		}
		System.out.println("Transcurrirán "+cont+" días desde hoy hasta el");
		return getFecha1();
	}
}
