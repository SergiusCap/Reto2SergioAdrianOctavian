package Reto;

public class Funciones2 {

	
	//Funcion pasar grados celsius a Fahrenheit
	public static double  CelsiusFahrenheit(double n1) {
		return( n1 * 1.8)+32;
				
	}
	
	
	//Funcion pasar grados Fahrenheit a celsius 
	public static double  FahrenheitCelsius(double n1) {
		return( n1 - 32)*5/9;
				
	}
	
	
	
	//Funcion pasar litros a galones
	public static double litrosgalones (double n1) {
		return n1 / 3.785;
				
	}
	//Funcion pasar galones a litros
	public static double galoneslitros (double n1) {
		return  n1 * 3.785;
				
	}
	
	
	
	
}
