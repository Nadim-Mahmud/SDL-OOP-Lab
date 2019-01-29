package main;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class DataTypes {
	
	public DataTypes(){
		
		//      Int Data Types
		
		
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
		
		/*
		 *  "Nadim" Calls string literal
		 */
		
		/*
		 * Concatanation
		 */
		String jobTitle = "Agent"; 
		int employeeId = 7; 
		String bond = jobTitle + employeeId;//int will convert into string
		System.out.println(bond);
		
		/*
		 * String Input
		 * The sequence \" is called an escape sequence.
		 * to print this use \\
		 */
		Scanner sc = new Scanner(System.in);
		//String name = sc.next(); 
		//System.out.println(name);
		
		/*
		 * Accessing charecter
		 */
		String name = "Harry"; 
		char start = name.charAt(0); 
		
		/*
		 * Substring
		 * spacify the starting and ending position
		 * if starting index is larger than string than it is exception
		 */
		String greeting = "Hello, World!"; 
		String sub = greeting.substring(0, 5); // sub is "Hello" 
		String tail = greeting.substring(7); // Copies all characters from position 7 on 
		System.out.println(sub);
		System.out.println(tail);
		
		//changeble class
		
		/**
		 * if it dont found the replaceable part on the string then it will replace nothing
		 * Repalce string
		 */
		
		String name1 = new String("Hurry");
		String pr = new String();
		pr = name1.replace("ry","nadim");
		System.out.println(pr);
		
		
	}
}
