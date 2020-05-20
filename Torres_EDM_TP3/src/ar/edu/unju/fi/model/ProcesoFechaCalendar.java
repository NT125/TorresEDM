package ar.edu.unju.fi.model;

import java.text.SimpleDateFormat;
import java.util.*;

public class ProcesoFechaCalendar {
	
	private Calendar fecha1, fecha2;
	
	public ProcesoFechaCalendar() {}

	public ProcesoFechaCalendar(Calendar fecha1, Calendar fecha2) {
		super();
		this.fecha1 = fecha1;
		this.fecha2 = fecha2;
	}

	public Calendar getFecha1() {
		return fecha1;
	}

	public void setFecha1(Calendar fecha1) {
		this.fecha1 = fecha1;
	}

	public Calendar getFecha2() {
		return fecha2;
	}

	public void setFecha2(Calendar fecha2) {
		this.fecha2 = fecha2;
	}
	
	public String formatearFecha()
	{
		SimpleDateFormat formato= new SimpleDateFormat("dd/MM/YYYY");
		String fecha=formato.format(getFecha1().getTime());
		return fecha;
	}
	
	public String compararFechas()
	{
		String respuesta;
		if(getFecha1().compareTo(getFecha2()) > 0) //.compareTo() retorna un número entero positivo o negativo dependiendo si la primer fecha es posteri
		{										   // retorna 0 si las fechas son idénticas
			respuesta="La fecha "+getFecha1().getTime()+" es posterior a la fecha "+getFecha2().getTime();
		}
		else
		{
			if (getFecha1().compareTo(getFecha2()) < 0)
			{
				respuesta="La fecha "+getFecha1().getTime()+" es anterior a la fecha "+getFecha2().getTime();
			}
			else
			{
				respuesta="Las fechas son idénticas";
			}
		}
		return respuesta;
	}
	
	public Calendar sumarDias()
	{
		Calendar fechaObjetivo = new GregorianCalendar(2020, 04, 15);
		Calendar fechaaux = Calendar.getInstance();
		int cont=0;
		
		while (getFecha1().before(fechaObjetivo))
		{
			fechaaux.add(Calendar.DAY_OF_YEAR, 1);
			setFecha1(fechaaux);
			cont++;
		}
		System.out.println("Transcurrirán "+cont+" días desde hoy hasta el");
		return getFecha1();
	}
	
	public Calendar contarTiempoTranscurrido()
	{
		int anios = getFecha2().get(Calendar.YEAR) - getFecha1().get(Calendar.YEAR);
		int meses = getFecha2().get(Calendar.MONTH) - getFecha1().get(Calendar.MONTH);
		int dias = getFecha2().get(Calendar.DAY_OF_MONTH) - getFecha1().get(Calendar.DAY_OF_MONTH);
		
		Calendar fechaaux = new GregorianCalendar(anios,meses,dias);
		return fechaaux;
		
	}

}
