package Reto;

public class Funciones1 {
/* Introducimos kilometros y lo dividimos sobre un valor fijo para obtener las millas*/
	public static double kilometrosmillas(double a) {
		
		return a/1.609;
	}
	/*Introducimos las millas y lo multiplica sobre un valor fijo para obtener los kilometros aproximados */
	public static double millaskilometros(double a) {
		return a*1.609;
	}
	/* Introducimos los kilogramos y lo multiplica sobre un valor fijo para obtener las libras*/
	public static double kilogramoslibras(double a) {
		return a*2.205;
	}
	/* Introducimos las libras y lo dividimos sobre un valor fijo para obtener los kilogramos*/
	public static double libraskilogramos(double a) {
		return a/2.205;
	}
}
