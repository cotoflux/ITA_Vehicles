package com.vehicles.project;
import java.util.*;
public class Principal {

	public static void main(String[] args) {
		
		Scanner pregunta1 = new Scanner(System.in);
		String matriculaUsuari;
		System.out.println("Siusplau posa la teva matricula ");
		matriculaUsuari= pregunta1.nextLine();
		
		Scanner pregunta2 = new Scanner(System.in);
		String laMarca;
		System.out.println("Siusplau posa la marca del teu cotxe: ");
		laMarca = pregunta2.nextLine();
		
		Scanner pregunta3 = new Scanner(System.in);
		String colorUsuari;
		System.out.println("Siusplau escriu el color del coche: ");
		colorUsuari = pregunta3.nextLine();
		
		Car cotxeUsuari = new Car(matriculaUsuari, laMarca, colorUsuari);
		
		System.out.println(cotxeUsuari.brand);
		System.out.println(cotxeUsuari.color);
		System.out.println(cotxeUsuari.plate);
	}

}
