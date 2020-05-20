package ar.edu.unju.fi.modelo;

public class CalculoMatematico {
	
	private int numero;
	
	public CalculoMatematico() {}

	public CalculoMatematico(int numero) {
		super();
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	//	
	
	public void calcularPrimos(int numero) {
		
		int aux=0, i;
		
		 for(i=1;i<(numero+1);i++){
			 
	         if(numero%i==0){
	             aux++;
	            }
		 }
		 
	     if(aux!=2){
	    	 System.out.println("No, no es número primo");
	     }else{
	         System.out.println("Sí, el número es primo");
	     }	
	}
	
	public int calcularFactorial(int numero) {
		
		if(numero == 0 || numero == 1)	{
			return 1;
		}
		else {			
			return numero * calcularFactorial(numero-1);		
		}
		
	}
	
	public int calcularCombinatoria(int numero) {
		int k=2;
		
		return (calcularFactorial(numero))/(calcularFactorial(k)*calcularFactorial(numero-k));
	}

}
