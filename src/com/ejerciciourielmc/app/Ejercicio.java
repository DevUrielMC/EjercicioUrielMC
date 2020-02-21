package com.ejerciciourielmc.app;

import java.util.Scanner;

public class Ejercicio {

		
	public static void main(String[] args) {
		//Llamada al método para que el usuario ingrese los rangos a evaluar
		IngresarRangos();
			

	}

	private static void IngresarRangos() {
		//Declaración de variables tipo int
		int init_org = 0;
		int fin_org = 0;

		//Creacion de objeto tipo Scanner (valor de inicio)
		Scanner myInputIn = new Scanner(System.in);
		System.out.println("Introduce un numero de entrada: ");
		//Asignación del objeto tipo Scanner con el numero introducido por el usuario a la variable tipo int
		init_org = myInputIn.nextInt();

		//Creacion de objeto tipo Scanner(valor de fin)
		Scanner myInputFinal = new Scanner(System.in);
		System.out.println("Introduce el numero final: ");
		//Asignación del objeto tipo Scanner con el numero introducido por el usuario a la variable tipo int
		fin_org = myInputFinal.nextInt();

		
		//Llamada el método y asignación de parametros.
		CalcularMultiplos_Rangos(init_org, fin_org);
	}

	private static void CalcularMultiplos_Rangos(int init, int fin) {
		// Método para iterar en el rango puesto por el usuario
		for (int i = init; i <= fin; i++) {
			// se llama al método establecido para calcular numeros y le asignamos el valor de i
			
			CalcularMultiplos(i);

	
		}
	}

	private static void CalcularMultiplos(int i) {
		// Modulos de 3 y 5 = FizzBuzz
		if ((i % 3 == 0) && (i % 5 == 0)) {
			System.out.println("FizzBuzz " + i);

		}
		// Modulos de 3 = Fizz
		else if (i % 3 == 0) {

			System.out.println("Fizz " + i);

		}
		// Modulos de 5 = Buzz
		else if (i % 5 == 0) {
			System.out.println("Buzz " + i);

		//Imprimir los numeros restantes
		} else {
			System.out.println(i);
		}
	}

}
