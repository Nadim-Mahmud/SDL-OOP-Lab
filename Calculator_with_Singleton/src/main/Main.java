package main;

public class Main {
	
	public static void main(String [] arg) {
		
		System.out.println(CalculatorSingleton.getSingleton().sum(12,17));
		System.out.println(CalculatorSingleton.getSingleton().difference(12,17));
	}
}
