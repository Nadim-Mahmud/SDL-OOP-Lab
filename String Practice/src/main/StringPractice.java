package main;

import javax.swing.JOptionPane;

public final class StringPractice {

	public static void main(String[] args) {
		
		//String in =  JOptionPane.showInputDialog("Enter price:"); 
		
		//System.out.println(in);
		
		char [] s = new char[23];
		
		StringBuffer str = new StringBuffer("Sachin"); 
        str.append(1);
        str.insert(2,3.75f);
        
        final int bb = 3;
        System.out.println(bb);
        System.out.println(str); 

	}

}
