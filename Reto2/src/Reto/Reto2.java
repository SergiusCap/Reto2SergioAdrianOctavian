package Reto;

import java.util.Scanner;
import Reto.Funciones;
import Reto.Funciones1;
import Reto.Funciones2;
import Reto.Funciones3;

public class Reto2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int menu = 0;
		int menuLongitud = 0;
		String menutexto = "";
		do {
			System.out.println("Selecciona el tipo de conversación: ");
			System.out.println("1. Longitud");
			System.out.println("2. Peso");
			System.out.println("3. Temperatura");
			System.out.println("4. Volumen");
			System.out.println("0. Salir");

			menutexto = sc.nextLine();
			menu = Integer.parseInt(menutexto);
			switch (menu) {
			case 1:
				do {
					System.out.println("Selecciona la conversación de longitud: ");
					System.out.println("1. Millas a kilométros");
					System.out.println("2. Kilométros a millas");
					System.out.println("0. Salir");
					menutexto = sc.nextLine();
					menuLongitud = Integer.parseInt(menutexto);
					switch (menuLongitud) {
					case 1:
						System.out.println("Introduce las millas: ");
						double millas = Double.parseDouble(sc.nextLine());
						System.out.println(Funciones1.millaskilometros(millas));
						break;
					case 2:
						System.out.println("Introduce los kilometros: ");
						double kilometros = Double.parseDouble(sc.nextLine());
						System.out.println(Funciones1.kilometrosmillas(kilometros));
						break;
					case 0:

						break;

					default:
						System.out.println("Opción no valida");
						break;
					}
				} while (menuLongitud != 0);

				break;
			case 2:
				do {
					System.out.println("Selecciona la conversación de Peso: ");
					System.out.println("1. Libras a kilogramos");
					System.out.println("2. Kilogramos a libras");
					System.out.println("0. Salir");
					menutexto = sc.nextLine();
					menuLongitud = Integer.parseInt(menutexto);
					switch (menuLongitud) {
					case 1:
						System.out.println("Introduce las libras: ");
						double libras = Double.parseDouble(sc.nextLine());
						System.out.println(Funciones1.libraskilogramos(libras));
						break;
					case 2:
						System.out.println("Introduce los kilos: ");
						double kilos = Double.parseDouble(sc.nextLine());
						System.out.println(Funciones1.kilogramoslibras(kilos));
						break;
					case 0:

						break;

					default:
						System.out.println("Opción no valida");
						break;

					}
				} while (menuLongitud != 0);
				break;
			case 3:
				do {
					System.out.println("Selecciona la conversación de Temperatura: ");
					System.out.println("1. De Celsius a Fahrenheit");
					System.out.println("2. De Fahrenheit a Celsius");
					System.out.println("0. Salir");
					menutexto = sc.nextLine();
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

				break;
			case 4:
				do {
					System.out.println("Selecciona la conversación de Volumen: ");
					System.out.println("1. De Litros a Galones");
					System.out.println("2. De Galones a litros");
					System.out.println("0. Salir");
					menutexto = sc.nextLine();
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
				break;
			case 0:
				System.out.println("Fin del programa");
				break;
			default:
				System.out.println("Opción no valida");
				break;
			}

		} while (menu != 0);

	}

}
