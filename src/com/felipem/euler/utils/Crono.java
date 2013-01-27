/**
 * 
 */
package com.felipem.euler.utils;

/**
 * @author felipem ( http://felipem.com )
 *
 */
public class Crono {

	private long inicio = 0;
	private long tiempoEnMarcha = 0;
	
	public Crono() {
		inicio = System.currentTimeMillis();
	}
	public void start() {
		inicio = System.currentTimeMillis();
	}
	public void restart() {
		inicio = 0;
		tiempoEnMarcha = 0;
	}
	public long total() {
		return System.currentTimeMillis() - inicio;
	}
	
}
