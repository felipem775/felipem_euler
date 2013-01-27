/**
 * 
 */
package com.felipem.euler.problema019;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author felipem ( http://felipem.com )
 *
 */
public class Problema019 {

	/**
	 * You are given the following information, but you may prefer to do some research for yourself.
	 * 
	 * * 1 Jan 1900 was a Monday.
	 * * Thirty days has September,
	 *   April, June and November.
	 *   All the rest have thirty-one,
	 *   Saving February alone,
	 *   Which has twenty-eight, rain or shine.
	 *   And on leap years, twenty-nine.
	 * * A leap year occurs on any year evenly divisible by 4, but not on a century unless it is divisible by 400.
	 * 
	 * How many Sundays fell on the first of the month during the twentieth century (1 Jan 1901 to 31 Dec 2000)?
	 * 
	 * 
	 * Se te da la siguiente información, pero quizá prefieras investigar por tí mismo.
	 * 
	 * * El 1 de enero de 1900 fue lunes.
	 * * Treinta días trae noviembre,
	 *   con abril, junio y septiembre.
	 *   Los demás treinta y uno,
	 *   Salvo febrero, solo uno,
	 *   con veintiocho, lluvia y nieve.
	 *   Y en bisiestos, veintinueve.
	 * * Un año bisiesto sucede en cualquier año divisible entre 4, pero no si es divisible entre 100, a menos que ese año sea divisible entre 400.
	 *   
	 *   ¿Cuántos domingos cayeron en el primer día del mes durante el siglo XX (del 1 de enero de 1901 hasta el 31 de diciembre del 2000)?
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		GregorianCalendar ini = new GregorianCalendar(1901,Calendar.JANUARY,1);
		GregorianCalendar end = new GregorianCalendar(2000,Calendar.DECEMBER,31);
		int sunday = 0;
		while (ini.before(end)) {
			if (ini.get(Calendar.DAY_OF_WEEK) == 1 ) {
				sunday++;
			}
			ini.add(Calendar.MONTH, 1);
		}
		System.out.println(sunday);
	}

}
