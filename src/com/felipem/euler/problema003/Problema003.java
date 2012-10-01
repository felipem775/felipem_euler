/**
 * 
 */
package com.felipem.euler.problema003;

import java.util.List;

import com.felipem.euler.math.Primo;

/**
 * @author felipem ( http://felipem.com )
 *
 */
public class Problema003 {
	
	/**
	 *  Los factores primos de 13.195 son 5, 7, 13 y 29.
	 *  ¿ Cuál es el factor primo más grande del número 600851475143 ? 
	 * 
	 * The prime factors of 13195 are 5, 7, 13 and 29.
	 * What is the largest prime factor of the number 600851475143 ?Cada nuevo término en la sucesión de Fibonacci es generado por la adición de los dos términos anteriores. Comenzando con 1 y 2, los 10 primeros términos serían:
	 *  
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * Inicilizo valores
		 */
		long inicio = System.currentTimeMillis();
		long numero = 600851475143L ;
		//long max = (long) Math.sqrt(numeroABuscar) - 1;
		Primo primo = new Primo();
		primo.esPrimo(numero);
		System.out.println(System.currentTimeMillis() - inicio);
		List<Long> primosConocidos = primo.getPrimosConocidos();
		for (int i = primosConocidos.size() -1; i > -1; i--) {
			if (numero % primosConocidos.get(i) == 0) {
				System.out.println(primosConocidos.get(i));
				break;
			}
		}
		System.out.println(System.currentTimeMillis() - inicio);
	}
}
