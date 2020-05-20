package ar.edu.unju.fi.model;

public class ProcesoWrappers {
	private Integer numeroEntero1, numeroEntero2;
	private Double numeroDecimal1, numeroDecimal2;
	private String numeroString;
	
	public ProcesoWrappers() {}

	public ProcesoWrappers(Integer numeroEntero1, Integer numeroEntero2, Double numeroDecimal1, Double numeroDecimal2,
			String numeroString) {
		super();
		this.numeroEntero1 = numeroEntero1;
		this.numeroEntero2 = numeroEntero2;
		this.numeroDecimal1 = numeroDecimal1;
		this.numeroDecimal2 = numeroDecimal2;
		this.numeroString = numeroString;
	}

	public Integer getNumeroEntero1() {
		return numeroEntero1;
	}

	public void setNumeroEntero1(Integer numeroEntero1) {
		this.numeroEntero1 = numeroEntero1;
	}

	public Integer getNumeroEntero2() {
		return numeroEntero2;
	}

	public void setNumeroEntero2(Integer numeroEntero2) {
		this.numeroEntero2 = numeroEntero2;
	}

	public Double getNumeroDecimal1() {
		return numeroDecimal1;
	}

	public void setNumeroDecimal1(Double numeroDecimal1) {
		this.numeroDecimal1 = numeroDecimal1;
	}

	public Double getNumeroDecimal2() {
		return numeroDecimal2;
	}

	public void setNumeroDecimal2(Double numeroDecimal2) {
		this.numeroDecimal2 = numeroDecimal2;
	}

	public String getNumeroString() {
		return numeroString;
	}

	public void setNumeroString(String numeroString) {
		this.numeroString = numeroString;
	}

	public Integer calcularSuma()
	{
		return getNumeroEntero1()+getNumeroEntero2();
	}
	
	public Double calcularDivision()
	{
		Double resultado = 0.0;
		try
		{
			resultado=getNumeroDecimal1()/getNumeroDecimal2();
		}catch(Exception e)
		{
			System.out.println("IMPOSIBLE DIVIDIR POR CERO...");
		}
		return resultado;
	}
	
	public Double convertirNumerico()
	{
		double casteo = 0.0;
		try
		{
			casteo=Double.parseDouble(getNumeroString());
		}catch(NumberFormatException e)
		{
			System.out.println("ERROR EN EL FORMATO DECIMAL:");
			System.out.println("El separador decimal debe ser un punto (.)");
		}
		return casteo;
	}
	
}
