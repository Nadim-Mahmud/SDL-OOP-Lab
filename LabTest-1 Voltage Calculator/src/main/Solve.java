package main;

import java.io.*;

public class Solve {
	
	public double B,R,C,T0,Tn;
	
	public void set(double Bin,double Rin,double Cin,double T0in,double Tnin) {
		
		B = Bin;
		R = Rin;
		C = Cin;
		T0 = T0in;
		Tn = Tnin;
	}
	
	double equation(double t) {
		
		return B*(1 - Math.pow(Math.E,-t/(R*C)));
	}
	
	public void calculation() {
		
		double i=0.0,tmp=0.0,ans=0.0;
		
		tmp = (Tn - T0)/100.0;
		
		try {
			FileWriter out = new FileWriter("rc.txt");
			
			for(i=T0;i<=Tn;i+=tmp) {
				
				ans = equation(i);
				out.write(i + " " + ans + "\n\n");
				
			}
			out.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
}
