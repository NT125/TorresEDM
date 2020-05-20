package ar.edu.unju.fi.modelo;

public class Mascota {
	
	public String nombre, tipo;
	public int edad;
	public double peso;
	
	public Mascota() {}

	public Mascota(String nombre, String tipo, int edad, double peso) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
		this.edad = edad;
		this.peso = peso;
	}
	
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	//

	public double calcularDosis(double peso) {
		return 0.5 * peso;
	}

	public String mostrarDatosMascota() {
		return ("Nombre Mascota: "+getNombre()+" - Edad: "+getEdad()+" - Peso: "+getPeso()+"kg - Tipo: "+getTipo()+" - Dosis: "+calcularDosis(getPeso())+"mg");
	}

}
