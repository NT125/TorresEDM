package ar.edu.unju.fi.principal;

public class Principal7 {

	public static void main(String[] args) {
		int i=320;
		
		System.out.println("BUCLE WHILE");
		while(i>=160) {
			System.out.println(i);
			i-=20;
		}
		System.out.println();
		
		i=320;
		System.out.println("BUCLE DO-WHILE");
		do {
			System.out.println(i);
			i-=20;
		}while(i>=160);
		System.out.println();
		
		i=320;
		System.out.println("BUCLE FOR");
		
		for(i=320;i>=160;i-=20) {
			System.out.println(i);
		}
	}
}
