package main;

public class AbstractClass {
	
	public static void main(String arg[]) {
		shuvo ss = new Nadim();
		ss.call();
	}
}

abstract class shuvo{ /// Abstract Class
	
	void call() {
		System.out.println("calling..");
	}
	abstract void print();
	abstract void run();
}

class Nadim extends shuvo{ //Concreate Class
	
	void print() {
		System.out.println("Printing");
	}
	
	void run() {
		System.out.println("running");
	}
}