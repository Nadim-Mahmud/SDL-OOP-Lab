//package main;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	
    public static void main(String [] arg) {
  
    	long  ts,cas=0,cn,i;
    	
    	Scanner sc = new Scanner(System.in);
    	
    	ts = sc.nextInt();
    	
    	BigInteger n = new BigInteger("1");
    	BigInteger k = new BigInteger("1");
    	BigInteger m = new BigInteger("1");
    	BigInteger ml = new BigInteger("1");
    	
    	while(++cas<=ts) {
    		
    		n = sc.nextBigInteger();
    		k = sc.nextBigInteger();
    		m = sc.nextBigInteger();
    		
    		ml = n;
    		cn = 0;
    		while(true) {
    			
    			ml = ml.multiply(k);
    			
    			if(ml.compareTo(m)>=1) break;
    			
    			n = n.multiply(k);
    			
    			cn++;
    		}
    		System.out.println(cn);
    	}
    }
}
