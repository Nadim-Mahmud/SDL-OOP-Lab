package main;

public class CalculatorSingleton {
	
	private static volatile CalculatorSingleton instance = null;
	
	private CalculatorSingleton() {
		
	}
	
	public static CalculatorSingleton getSingleton() {
		
		if(instance == null ) {
			
			synchronized(CalculatorSingleton.class){
				
				if(instance == null) {
					
					instance = new CalculatorSingleton();
					
					System.out.println("Class Created");
				}
			}
		}
		
		return instance;
	}
	
	public int sum(int pr1,int pr2) {
		
		return pr1 + pr2;
	}
	
	public int difference(int pr1,int pr2) {
		
		return Math.abs(pr1 - pr2);
	}
	
}
