/**
 * 
 */
package com.felipem.euler.math;

import java.util.ArrayList;
import java.util.List;

/**
 * @author felipem ( http://felipem.com )
 * Clase útil para números primos
 */
public class Primo {
	
	/**
	 * Realizo un listado de números primos conocidos para validar un número
	 */
	private List<Integer> primosConocidos = new ArrayList<Integer>();
	
	/**
	 * Añado los dos primeros números primos para optimizar un poco el proceso
	 */
	public Primo() {
		primosConocidos.add(2);
		primosConocidos.add(3);
	}
	
	/**
	 * Comprueba si un número es primo, para ello realiza comprobación básica y posteriormente mira todos los primos menores a ese número.
	 * @param numero
	 * @return
	 */
	public boolean esPrimo(int numero) {
		if (numero < 2 || numero % 2 == 0) {
			return false;
		}
		// Miro si es un número que puede que ya haya comprobado
		if (numero > primosConocidos.get(primosConocidos.size()-1)) {
			
			// Calculo hasta la mitad por optimizar
			int mitad = numero/2;
			// Empiezo a mirar por el último primo
			for (int i = primosConocidos.get(primosConocidos.size()-1); i < mitad; i = i+2) {
				primoConocido(i);
			}
			
		}
		// Finalmente valido el último número
		return primoConocido(numero);
		
	}
	/**
	 * Compruebo si un número es primo utilizando la lista de los primos conocidos.
	 * @param numero
	 * @return
	 */
	private boolean primoConocido(int numero) {
		
		if (primosConocidos.contains(numero)) {
			return true;
		}
		for (int i = 0; i < primosConocidos.size(); i++) {
			if (numero % primosConocidos.get(i).intValue() == 0 ) return false;
		}
		primosConocidos.add(numero);
		return true;
	}
}
