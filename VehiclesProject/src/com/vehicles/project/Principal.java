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
		
		
		List<Wheel> wheelsDelanteras = new ArrayList<Wheel>();
		
			Scanner pregunta4 = new Scanner(System.in);
			System.out.println("Siusplau dona'm la marca de les rodes delanteres: ");
			String rodesMarcaDevant = pregunta4.nextLine();
		
			Scanner pregunta5 = new Scanner(System.in);
			System.out.println("Siusplau dona'm el diàmetre de les rodes delanteres: ");
			double diametreRodesDevant = pregunta5.nextDouble();
			
			Wheel añadeRuedasDelanteras = new Wheel(rodesMarcaDevant, diametreRodesDevant);
			
			
					
		List<Wheel> wheelsTraseras = new ArrayList<Wheel>();
		
			Scanner pregunta6 = new Scanner(System.in);
			System.out.println("Siusplau dona'm la marca de les rodes traseres: ");
			String rodesMarcaTraseres = pregunta6.nextLine();
		
			Scanner pregunta7 = new Scanner(System.in);
			System.out.println("Siusplau dona'm el diàmetre de les rodes traseres: ");
			double diametreRodesTraseres = pregunta7.nextDouble();
			
			Wheel añadeRuedasTraseras = new Wheel(rodesMarcaTraseres, diametreRodesTraseres);

			addWheels(wheelsDelanteras, wheelsTraseras);
		
		

	}

	private static void addWheels(List<Wheel> wheelsDelanteras, List<Wheel> wheelsTraseras) {
		// TODO Auto-generated method stub
		
	}

}
