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
	 * 2¹⁵ = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
	 * 
	 * What is the sum of the digits of the number 2¹⁰⁰⁰?
	 * 
	 * 
	 * 2¹⁵ = 32768 y la suma de sus dígitos es 3 + 2 + 7 + 6 + 8 = 26.
	 * 
	 * ¿Cuál es la suma de los dígitos del número 2¹⁰⁰⁰?
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		Double num = Math.pow(2, 1000);
		
		
		String numLetras = String.format("%f",num);
		
		int suma = 0;
		
		for (int i = 0; i < numLetras.length(); i++) {
			try {
				suma += new Integer(numLetras.substring(i,i+1));
			} catch (Exception e) {
				
				break;
			}
		}
		System.out.println(suma);
		

	}

}