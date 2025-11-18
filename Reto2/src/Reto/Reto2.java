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
				Funciones1.longitud();
				break;
			case 2:
				Funciones1.peso();
				break;
			case 3:
				Funciones2.temperatura();
				break;
			case 4:
				Funciones2.volumen();
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
