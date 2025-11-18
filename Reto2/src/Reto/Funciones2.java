package Reto;

import java.util.Scanner;

public class Funciones2 {

	// Funcion pasar grados celsius a Fahrenheit
	public static double CelsiusFahrenheit(double n1) {
		return (n1 * 1.8) + 32;

	}

	// Funcion pasar grados Fahrenheit a celsius
	public static double FahrenheitCelsius(double n1) {
		return (n1 - 32) * 5 / 9;

	}

	// Funcion pasar litros a galones
	public static double litrosgalones(double n1) {
		return n1 / 3.785;

	}

	// Funcion pasar galones a litros
	public static double galoneslitros(double n1) {
		return n1 * 3.785;

	}

	public static void temperatura() {
		Scanner sc = new Scanner(System.in);
		int menuLongitud = 0;
		do {
			System.out.println("Selecciona la conversación de Temperatura: ");
			System.out.println("1. De Celsius a Fahrenheit");
			System.out.println("2. De Fahrenheit a Celsius");
			System.out.println("0. Salir");
			String menutexto = sc.nextLine();
			menuLongitud = Integer.parseInt(menutexto);
			switch (menuLongitud) {
			case 1:
				System.out.println("Introduce los grados Celsius: ");
				double celsius = Double.parseDouble(sc.nextLine());
				System.out.println(Funciones2.CelsiusFahrenheit(celsius));
				break;
			case 2:
				System.out.println("Introduce los grados Fahrenheit: ");
				double fahrenheit = Double.parseDouble(sc.nextLine());
				System.out.println(Funciones2.FahrenheitCelsius(fahrenheit));
				break;
			case 0:
				break;
			default:
				System.out.println("Opción no valida");
				break;
			}
		} while (menuLongitud != 0);
		
	}

	public static void volumen() {
		Scanner sc = new Scanner(System.in);
		int menuLongitud = 0;
		do {
			System.out.println("Selecciona la conversación de Volumen: ");
			System.out.println("1. De Litros a Galones");
			System.out.println("2. De Galones a litros");
			System.out.println("0. Salir");
			String menutexto = sc.nextLine();
			menuLongitud = Integer.parseInt(menutexto);
			switch (menuLongitud) {
			case 1:
				System.out.println("Introduce los Litros: ");
				double litros = Double.parseDouble(sc.nextLine());
				System.out.println(Funciones2.litrosgalones(litros));
				break;

			case 2:
				System.out.println("Introduce los Galones ");
				double galones = Double.parseDouble(sc.nextLine());
				System.out.println(Funciones2.galoneslitros(galones));
				break;
			case 0:
				break;
			default:
				System.out.println("Opción no valida");
				break;
			}
		} while (menuLongitud != 0);
		
	}

}
