package main;

import java.util.Scanner;

public class SpeedValidate {
	
	public double tension(double speed,double m) {
		
		double r = 3.0;
		return (m*speed*speed)/r;
	}
	
	public int maxSpeed(double mass ) {
		
		double maxT=60, r=3;
		double eps = 10E-10;
		int ans = 1;
		
		int speed[]={1,10,20,40};
		
		for(int i=0; i<4 ; i++)
		{
			if(tension(speed[i],mass)<=maxT) {
				ans = speed[i];
			}
		}
		//System.out.println(ans);
		return ans;
	}

}
