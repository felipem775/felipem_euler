/**
 * 
 */
package com.felipem.euler.problema016;

import java.math.BigInteger;

/**
 * @author felipem ( http://felipem.com )
 *
 */
public class Problema016 {

	/**
	 * 215 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
	 * What is the sum of the digits of the number 21000?
	 * 
	 * 2^15 = 32768 y la suma de sus dígitos es 3 + 2 + 7 + 6 + 8 = 26.
	 * ¿Cuál es la suma de los dígitos del número 2^1000?
	 *  
	 * @param args
	 */
	public static void main(String[] args) {
		
		BigInteger numero = BigInteger.valueOf(2);
		numero = numero.pow(1000);
		
		String cad = numero.toString();
		int contador = 0;
		
		for (int i = 0; i < cad.length(); i++) {
			contador += Integer.parseInt(cad.substring(i, i+1));
		}
		
		System.out.println(contador);
	}

}
