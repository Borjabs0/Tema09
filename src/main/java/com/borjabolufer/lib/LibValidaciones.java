package com.borjabolufer.lib;
import java.util.Scanner;

public class LibValidaciones {
    private static Scanner lector = new Scanner(System.in);

	/**
	 * Función para escribir un mensaje en consola y validar el número entero introducido por el usuario, si está entre el mínimo y máximo permitido.
	 * @param mensaje
	 * @param valorMin
	 * @param valorMax
	 * @return Devuelve un Entero si es válido. (El número intorducido por el usuario si está entre los límites).
	 */
	public static int solicitarInt(String mensaje, int valorMin, int valorMax){
		boolean valido;
		int resultado;
		do{
			System.out.println(mensaje);
			resultado = Integer.parseInt(lector.nextLine());
			valido = (resultado >= valorMin && resultado <= valorMax);
			if (!valido){
				System.out.printf("Error => Valor mínimo: %d, Valor máximo: %d\n", valorMin, valorMax);
			}
		}while (!valido);
		return resultado;
	}

	/**
	 * Función para escribir un mensaje en consola y validar el número con decimales introducido por el usuario, si está entre el mínimo y máximo permitido.
	 * @param mensaje
	 * @param valorMin
	 * @param valorMax
	 * @return Devuelve un Double si es válido. (El número intorducido por el usuario si está entre los límites).
	 */
	public static double solicitarDouble(String mensaje, double valorMin, double valorMax){
		boolean valido;
		double resultado;
		do{
			System.out.println(mensaje);
			resultado = Double.parseDouble(lector.nextLine());
			valido = (resultado >= valorMin && resultado <= valorMax);
			if (!valido){
				System.out.printf("Error => Valor mínimo: %e, Valor máximo: %e\n", valorMin, valorMax);
			}
		}while (!valido);
		return resultado;
	}

	//Función para leer un String, validando valor min y max.
	/**
	 * Función para escribir un mensaje en consola y validar la cadena introducida por el usuario, si está entre al mínima y máxima longitud.
	 * @param mensaje
	 * @param longitudMinima
	 * @param longitudMaxima
	 * @return Devuelve un String con la cadena introducida por el usuario, si es válida.
	 */
	public static String solicitarString(String mensaje, int longitudMinima, int longitudMaxima){
		boolean valido;
		String resultado;
		do {
			System.out.println(mensaje);
			resultado = lector.nextLine();
			valido = resultado.length() >= longitudMinima && resultado.length() <= longitudMaxima;
			if(!valido){
				System.out.printf("Error => Longitud mínima: %d, Longitud máxima: %d\n", longitudMinima, longitudMaxima);
			}
		}while(!valido);
		return resultado;
	}

	/**
	 * Función para mostrar un mensaje por consola y validar la longitud de números en binario (0 y 1). Usa otra función para validar.
	 * @param mensaje
	 * @param longitudMinima
	 * @param longitudMaxima
	 * @return Devuelve un String con el número binario introducido si es válido.
	 */
	public static String solicitarStringBinario(String mensaje, int longitudMinima, int longitudMaxima){
		boolean valido;
		String resultado;
		do {
			System.out.println(mensaje);
			resultado = lector.nextLine();
			valido = resultado.length() >= longitudMinima && resultado.length() <= longitudMaxima && esBinario(resultado);
			if(!valido){
				System.out.printf("Error => Longitud mínima: %d, Longitud máxima: %d\n", longitudMinima, longitudMaxima);
			}
		}while(!valido);
		return resultado;
	}
	/**
	 * Función para valida un String de números binarios, solo es válido si la cadena contiene 0 y 1.
	 * @param cadena
	 * @return Devuelve un booleano TRUE or FALSE dependiendo de los números introducidos.
	 */
	public static boolean esBinario(String cadena){
        return cadena.matches("[01]+");
    }
}
