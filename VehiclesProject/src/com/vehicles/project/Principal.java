package com.vehicles.project;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class Principal {

	public static void main(String[] args) {
		
		Scanner preguntaPrimera = new Scanner(System.in);
		int carOrBike;
		System.out.println("Hola");
		System.out.println();
		System.out.println("Si vols construir un Coche escriu: 1");
		System.out.println("Si vols cosntruir una Bicicleta escriu: 2");
		carOrBike = preguntaPrimera.nextInt();
		if(carOrBike == 1) {
			System.out.println("Elegim: " + carOrBike + " . Coche");
			
			//Inici coche
			
			Scanner pregunta1 = new Scanner(System.in);
			String matriculaUsuari;
			String matriculaConfirmada = "";
			System.out.println("Siusplau posa la teva matricula, recorda que te entre 6 i 7 caracters en maj�scula");
			matriculaUsuari= pregunta1.nextLine();
			
		    Pattern pat = Pattern.compile("([A-Z]{2,3})(\\d{4})([A-Z]{0,2})");
		    Matcher mat = pat.matcher(matriculaUsuari);
			
			if(mat.matches()) {
				
				matriculaConfirmada = matriculaUsuari;
							
				Scanner pregunta2 = new Scanner(System.in);
				String laMarca;
				System.out.println("Siusplau posa la marca del teu cotxe: ");
				laMarca = pregunta2.nextLine();
				
				Scanner pregunta3 = new Scanner(System.in);
				String colorUsuari;
				System.out.println("Siusplau escriu el color del coche: ");
				colorUsuari = pregunta3.nextLine();
				
				Car cotxeUsuari = new Car(matriculaConfirmada, laMarca, colorUsuari);
				
				System.out.println(cotxeUsuari.brand);
				System.out.println(cotxeUsuari.color);
				System.out.println(cotxeUsuari.plate);
				
				
				List<Wheel> wheelsDelanteras = new ArrayList<Wheel>();
				
					Scanner pregunta4 = new Scanner(System.in);
					System.out.println("Siusplau dona'm la marca de les rodes delanteres: ");
					String rodesMarcaDevant = pregunta4.nextLine();
				
					Scanner pregunta5 = new Scanner(System.in);
					System.out.println("Siusplau dona'm el di�metre de les rodes delanteres: ");
					double diametreRodesDevant = pregunta5.nextDouble();
					
					if(diametreRodesDevant>0.4 && diametreRodesDevant<4.0){
						System.out.println("Diamtre correcter");
						
						//Inicio diametro
						
								Wheel rueda1 = new Wheel(rodesMarcaDevant, diametreRodesDevant);
								Wheel rueda2 = new Wheel(rodesMarcaDevant, diametreRodesDevant);
								wheelsDelanteras.add(rueda1);
								wheelsDelanteras.add(rueda2);
								
								
								System.out.println(wheelsDelanteras.size());
			
								
							    for (Wheel i : wheelsDelanteras) {
							        System.out.println("Rodes delanteres: " + i);
							      }
										
							List<Wheel> wheelsTraseras = new ArrayList<Wheel>();
							
								Scanner pregunta6 = new Scanner(System.in);
								System.out.println("Siusplau dona'm la marca de les rodes traseres: ");
								String rodesMarcaTraseres = pregunta6.nextLine();
							
								Scanner pregunta7 = new Scanner(System.in);
								System.out.println("Siusplau dona'm el di�metre de les rodes traseres: ");
								double diametreRodesTraseres = pregunta7.nextDouble();
								
								Wheel a�adeRuedasTraseres1 = new Wheel(rodesMarcaTraseres, diametreRodesTraseres);
								Wheel a�adeRuedasTraseres2 = new Wheel(rodesMarcaTraseres, diametreRodesTraseres);
								
								wheelsTraseras.add(a�adeRuedasTraseres1);
								wheelsTraseras.add(a�adeRuedasTraseres2);
								
								System.out.println(wheelsTraseras.size());
			
								
							    for (Wheel j : wheelsTraseras) {
							        System.out.println("Rodes Traseres" + j);
							    }
							
								try {
									cotxeUsuari.addWheels(wheelsDelanteras, wheelsTraseras);
								} catch (Exception e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
						
						
						//Fin diametro
						
						 
					} else {
						System.out.println("El diametro no es correcto, vuelve a reiniciar el programa.");
					}
					
					
				
				
				//Fi introduccio codig
				
				
			} else {
				System.out.println("La matricula introduida no es correcte torna a executar el programa");

			}
			
			
			//Fi coche
		}else if(carOrBike == 2) {
			System.out.println("Elegim: " + carOrBike + " . Bicicleta");
		}else{
			System.out.println("Has introduit: " + carOrBike +" . No es una opci� correcte. Reinicia el programa");
		}
		

	}//La classe
} //final
