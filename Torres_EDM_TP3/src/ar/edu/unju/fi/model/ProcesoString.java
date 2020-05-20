package ar.edu.unju.fi.model;

public class ProcesoString {
	
	private String cadena;
	private char caracter;

	
	public ProcesoString() {}

	public ProcesoString(String cadena, char caracter) {
		super();
		this.cadena = cadena;
		this.caracter = caracter;
	}

	public String getCadena() {
		return cadena;
	}

	public void setCadena(String cadena) {
		this.cadena = cadena;
	}

	public char getCaracter() {
		return caracter;
	}

	public void setCaracter(char caracter) {
		this.caracter = caracter;
	}
	
	public int contarCantidadVocal()
	{
		String vocalesA = "aAáÁ";
		String vocalesE = "eEéÉ";
		String vocalesI = "iIíÍ";
		String vocalesO = "oOóÓ";
		String vocalesU = "uUúÚ";
		
		int contadorA=0, contadorE=0, contadorI=0, contadorO=0, contadorU=0, contFinal=0;
		
		for (int i=0; i < getCadena().length(); i++) 
		{
			for (int j=0; j < vocalesA.length(); j++)
			{
				if(getCadena().charAt(i)==vocalesA.charAt(j))
				{
					contadorA++;
				}
			}
			
			for (int j=0; j < vocalesE.length(); j++)
			{
				if(getCadena().charAt(i)==vocalesE.charAt(j))
				{
					contadorE++;
				}
			}
				
			for (int j=0; j < vocalesI.length(); j++)
			{
				if(getCadena().charAt(i)==vocalesI.charAt(j))
				{
					contadorI++;
				}
			}
			
			for (int j=0; j < vocalesO.length(); j++)
			{
				if(getCadena().charAt(i)==vocalesO.charAt(j))
				{
					contadorO++;
				}
			}
			
			for (int j=0; j < vocalesU.length(); j++)
			{
				if(getCadena().charAt(i)==vocalesU.charAt(j))
				{
					contadorU++;
				}
			}
		}
		
		if (getCaracter()=='a' || getCaracter()=='A')
		{
			contFinal=contadorA;
		}
		if (getCaracter()=='e' || getCaracter()=='E')
		{
			contFinal=contadorE;
		}
		if (getCaracter()=='i' || getCaracter()=='I')
		{
			contFinal=contadorI;
		}
		if (getCaracter()=='o' || getCaracter()=='O')
		{
			contFinal=contadorO;
		}
		if (getCaracter()=='u' || getCaracter()=='U')
		{
			contFinal=contadorU;
		}
		return contFinal;
	}
	
	public String reemplazarCaracter() // CORREGIR DESPUÉS
	{
		setCadena(getCadena().replace('A', Character.toUpperCase(getCaracter())));
		setCadena(getCadena().replace('a', getCaracter()));
		setCadena(getCadena().replace('á', getCaracter()));
		setCadena(getCadena().replace('Á', Character.toUpperCase(getCaracter())));
		return getCadena();
	}
	
	public String eliminarBlancos() 
	{
		return getCadena().replace(" ","");
	}
	
	public String determinarLongitud() 
	{
		int longitud = getCadena().length()-1;
		if (longitud >= 20)
		{
			return "La frase es larga, de "+longitud+" caracteres.";
		}
		else
		{
			return "La frase es corta, de "+longitud+" caracteres.";
		}
	}
	
	public String determinarPalindromo()
	{
		setCadena(eliminarBlancos());
		setCadena(getCadena().toLowerCase().replace("á","a").replace("é","e").replace("í", "i").replace("ó", "o").replace("ú", "u").replace(" ", "").replace(".", "").replace(",", ""));
		String inverso = new StringBuilder(getCadena()).reverse().toString();
		System.out.println(inverso);		
		if(getCadena().equals(inverso) == true)
		{
			return "Es un palíndromo";
		}
		else
		{
			return "No es un palíndromo";
		}
	}
	
	public String determinarPosición()
	{
		int pos=0, cont=0;
		boolean aux=false;
		char barra = '/';
		
		while(aux==false || pos==(getCadena().length()))
		{
			if (getCadena().charAt(pos)==barra)
			{
				++cont;
			}
			++pos;
			if(cont==3)
			{
				aux=true;
			}
		}
		
		if (aux==true)
		{
			return "La tercer barra está en la posición "+pos;
		}
		else
		{
			return "Sólo hay 2 barras o menos en la cadena";
		}
			
	}
	
	
// metodo del profe:
//	
//	private char verificarVocal (char vocal) {
//		char[] arreglo = new char[4];
//		
//		// Definiendo los arreglos por vocal		
//		char [] caracterA = new char [4];
//		caracterA[0] = 'a';
//		caracterA[1] = 'A';
//		caracterA[2] = 'á';
//		caracterA[3] = 'Á';
//		
//		char [] caracterE = new char [4];
//		caracterE[0] = 'e';
//		caracterE[1] = 'E';
//		caracterE[2] = 'é';
//		caracterE[3] = 'É';
//		
//		char [] caracterI = new char [4];
//		caracterI[0] = 'i';
//		caracterI[1] = 'I';
//		caracterI[2] = 'í';
//		caracterI[3] = 'Í';
//		
//		char [] caracterO = new char [4];
//		caracterO[0] = 'o';
//		caracterO[1] = 'O';
//		caracterO[2] = 'ó';
//		caracterO[3] = 'Ó';
//		
//		char [] caracterU = new char [4];
//		caracterU[0] = 'u';
//		caracterU[1] = 'U';
//		caracterU[2] = 'ú';
//		caracterU[3] = 'Ú';
//		
//		//Comparando y verificando
//		for (int k=0; k<3; k++) {
//			
//			if (caracter == caracterA[k]) {
//				arreglo = caracterA;				
//			}
//			
//			if (caracter == caracterE[k]) {
//				arreglo = caracterE;				
//			}
//			
//			if (caracter == caracterI[k]) {
//				arreglo = caracterI;				
//			}
//			
//			if (caracter == caracterO[k]) {
//				arreglo = caracterO;				
//			}
//			
//			if (caracter == caracterU[k]) {
//				arreglo = caracterU;				
//			}
//		}
//		return arreglo;
//	}

}
