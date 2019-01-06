package main;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) {
		
		//         Int Data Types
		
		
		//Charecter in unicode in Java So 2 Byte
		
		int x = 1000_99; // it is ligal 
		System.out.println(x+100/*(number literal)*/);
		
		/* 
		 * no auto type cast like c++ assign  double to int is illigal
		 */
		double xx = 100.0;
		int yy = 8;
		yy = (int)xx; 
		System.out.println(yy);
		
		/*
		 *  declaring final is like const in c++
		 *  final variable should be uppercase letters
		 */
		final double NICKEL_VALUE = 0.05;// Declarde in method style
		// public static final double LITERS_PER_GALLON = 3.785; //Declared in a class

		/*
		 * BiInteger/BigDecimal class
		 */
		BigInteger x1 = new BigInteger("100");
		BigDecimal d = new BigDecimal("4.35"); 
		BigDecimal e = new BigDecimal("100"); 
		BigDecimal f = d.multiply(e); 
		System.out.println(f); // Prints 435.00 
		
		/*
		 * Nearest rounded numbers
		 */
		long rounded = Math.round(13.75); 
		System.out.println(rounded);
		
		/*
		 * Avoid negetive mode result // robot turns -400 degree from 10 deg position
		 */
		int xxx = Math.floorMod(10 + (-400), 360);
		System.out.println(xxx);
		
		/*
		 * Formatting output
		 * printf can be use like c++
		 */
		double price = 10.246734;
		System.out.printf("%.2f\n", price); 
		System.out.printf("%10.2f\n", price);
		
		
		//          String Data Types
		
	}

}
