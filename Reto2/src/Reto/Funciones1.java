package Reto;

import java.util.Scanner;

public class Funciones1 {
	/*
	 * Introducimos kilometros y lo dividimos sobre un valor fijo para obtener las
	 * millas
	 */
	public static double kilometrosmillas(double a) {

		return a / 1.609;
	}

	/*
	 * Introducimos las millas y lo multiplica sobre un valor fijo para obtener los
	 * kilometros aproximados
	 */
	public static double millaskilometros(double a) {
		return a * 1.609;
	}

	/*
	 * Introducimos los kilogramos y lo multiplica sobre un valor fijo para obtener
	 * las libras
	 */
	public static double kilogramoslibras(double a) {
		return a * 2.205;
	}

	/*
	 * Introducimos las libras y lo dividimos sobre un valor fijo para obtener los
	 * kilogramos
	 */
	public static double libraskilogramos(double a) {
		return a / 2.205;

	}

	public static void longitud() {
		int menuLongitud = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Selecciona la conversación de longitud: ");
			System.out.println("1. Millas a kilométros");
			System.out.println("2. Kilométros a millas");
			System.out.println("0. Salir");
			String menutexto = sc.nextLine();
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

	}

	public static void peso() {
		Scanner sc = new Scanner(System.in);
		int menuPeso = 0;

		do {

			System.out.println("Selecciona la conversación de Peso: ");
			System.out.println("1. Libras a kilogramos");
			System.out.println("2. Kilogramos a libras");
			System.out.println("0. Salir");
			String menutexto = sc.nextLine();
			menuPeso = Integer.parseInt(menutexto);
			switch (menuPeso) {
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
		} while (menuPeso != 0);

	}

}
