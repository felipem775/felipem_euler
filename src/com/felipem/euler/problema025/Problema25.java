/**
 * 
 */
package com.felipem.euler.problema025;

import java.math.BigInteger;


/**
 * @author felipem ( http://felipem.com )
 *
 */
public class Problema25 {

	/**
	 *
	 * The Fibonacci sequence is defined by the recurrence relation:
	 *   Fn = Fn−1 + Fn−2, where F1 = 1 and F2 = 1.
	 * Hence the first 12 terms will be:
	 * F1 = 1
	 * F2 = 1
	 * F3 = 2
	 * F4 = 3
	 * F5 = 5
	 * F6 = 8
	 * F7 = 13
	 * F8 = 21
	 * F9 = 34
	 * F10 = 55
	 * F11 = 89
	 * F12 = 144
	 * 
	 * The 12th term, F12, is the first term to contain three digits.
	 * What is the first term in the Fibonacci sequence to contain 1000 digits?
	 * 
	 * La secuencia de Fibonacci se define por la siguiente relación de recurrencia:
	 *   Fn = Fn-1 + Fn-2, donde F1 = 1 y F2 = 1.
	 * Por lo tanto, los 12 primeros términos serán los siguientes:
	 * F1 = 1
	 * F2 = 1
	 * F3 = 2
	 * F4 = 3
     * F5 = 5
     * F6 = 8
     * F7 = 13
     * F8 = 21
     * F9 = 34
     * F10 = 55
  	 * F11 = 89
   	 * F12 = 144
   	 * 
   	 * El 12º término, F12, es el primer término en contener tres dígitos.
   	 * ¿Cuál es el primer término de la sucesión de Fibonacci en contener 1000 dígitos?
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		BigInteger numero = BigInteger.valueOf(1);
		BigInteger anterior = BigInteger.valueOf(0);
		BigInteger aux = BigInteger.valueOf(0); 
		int termino = 1;
		
		while (numero.toString().length() < 1000) {
			aux = numero;
			numero = numero.add(anterior);
			anterior = aux;
			termino++;
		}
		System.out.println(termino);
		
	}
	
	

}
