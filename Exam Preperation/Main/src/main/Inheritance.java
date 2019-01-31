package main;

public class Inheritance {
	public Inheritance() {
	}
}

class A{
	
	int i = 5;
	int a = 5;
	
	public A() {
		System.out.println("printing A1");
	}
	
	public A(int i) {
		System.out.println("printing A2");
	}
	
	void print() {
		System.out.println("printing A");
	}
}

class B extends A{
	
	int i = 3 ;
	int x;
	
	public B() {
		//Supper is autometicly called
		System.out.println("printing B1");
	}
	
	public B(int i) {
		super(i);
		System.out.println("printing B2");
	}
	
	void print() {
		System.out.println("printing B " + a);
	}
}

class C extends B{
	
	void print() {
		//System.out.println("printing c " + a); 
		//protected become private on  Sub class
	}
}
