package Reto;

import java.util.Scanner;

public class Funciones3 {

	
	
	
	public static double EuroADolar(double dinero) { //para de euro a dolar
		return dinero*1.16;
	}
	
	
	public static double DolarAEuro(double dinero) {// para de dolar a euro
		return dinero/1.16;
	}
	
	
	public static double GradoARadiante(double angulo) {// pasar de grado a radiante
		return angulo*Math.PI/180;
	}
	
	
	
	public static double RadianteAGrado(double angulo) {// pasar de radiante a grado
		return (angulo*180)/Math.PI;
	}
	
	
	
	public static void angulo() {
		Scanner sc = new Scanner(System.in);
		int menuAngulo = 0;
		do {
			System.out.println("Selecciona la conversación de Angulos: ");
			System.out.println("1. De Grado a Radiante");
			System.out.println("2. De Radiante a Grado");
			System.out.println("0. Salir");
			String menutexto = sc.nextLine();
			menuAngulo = Integer.parseInt(menutexto);
			switch (menuAngulo) {
			case 1:
				System.out.println("Introduce los Grados: ");
				double grados = Double.parseDouble(sc.nextLine());
				System.out.println(Funciones3.GradoARadiante(grados));
				break;
			case 2:
				System.out.println("Introduce los grados Radiantes: ");
				double radiante = Double.parseDouble(sc.nextLine());
				System.out.println(Funciones3.RadianteAGrado(radiante));
				break;
			case 0:
				break;
			default:
				System.out.println("Opción no valida");
				break;
			}
		} while (menuAngulo != 0);
		
	}
	
	
	public static void moneda() {
		Scanner sc = new Scanner(System.in);
		int menuMoneda = 0;
		do {
			System.out.println("Selecciona la conversación de Moneda: ");
			System.out.println("1. De Grado a Radiante");
			System.out.println("2. De Radiante a Grado");
			System.out.println("0. Salir");
			String menutexto = sc.nextLine();
			menuMoneda = Integer.parseInt(menutexto);
			switch (menuMoneda) {
			case 1:
				System.out.println("Introduce los Euros: ");
				double euros = Double.parseDouble(sc.nextLine());
				System.out.println(Funciones3.EuroADolar(euros));
				break;
			case 2:
				System.out.println("Introduce los Dolares: ");
				double dolar = Double.parseDouble(sc.nextLine());
				System.out.println(Funciones3.DolarAEuro(dolar));
				break;
			case 0:
				break;
			default:
				System.out.println("Opción no valida");
				break;
			}
		} while (menuMoneda != 0);
		
	}
	
	
	
	
}


