package main;

import java.io.*;
import java.util.*;


public class Main {

	public static void main(String[] args) {
		
		double B=0.0,R=0.0,C=0.0,T0=0.0,Tn=0.0;
		
		File name = new File("params.txt");
		
		try {
			
			Scanner sc = new Scanner(name);
			B = sc.nextDouble();
			R = sc.nextDouble();
			C = sc.nextDouble();
			T0 = sc.nextDouble();
			Tn = sc.nextDouble();	
			
			sc.close();
			
		} catch (FileNotFoundException e) {
			
			System.out.println("File Not Found");
		}
		
		Solve sv = new Solve();
		
		sv.set(B,R,C,T0,Tn);
		sv.calculation();
		
	}

}
