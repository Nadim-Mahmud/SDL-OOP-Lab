package main;

import java.util.Scanner;

public class TicketSeller {
	
	private Person [] person =  new Person[101];
	private int pos ;
	
	private int total = 100;
	public static int N=100;
	
	public static int BuyTicket(int NumOfTicket )
	{
		if(NumOfTicket>20) {
			NumOfTicket=20;
		}
		if(NumOfTicket>N)
			NumOfTicket=N;
		N-=NumOfTicket;
		
		return N;
	}
	
	
	
	
	
	////Unused code stub Unfit for unit test
	
	private int find(String name) {
		
		int i = 0;
		for(i=1;i<=pos;i++) {	
			if(name.equals(person[i].name) ) {
				return i;
			}
		}
		return ++pos;
	}
	
	public void sellr() {
		
		int i,j,total = 100,n,tmp,valid=4;
		pos = 0;
		String name;
		
		Scanner sc = new Scanner(System.in);
		
		while(total<=100) {
			
			System.out.println("Enter Name & Number of Tickets to buy :");
			
			name  = sc.next();
			n = sc.nextInt();
			
			tmp = find(name);
			
			System.out.println(tmp);
			
			if(n<=valid&&(total-n)>=0) {
				
				//System.out.println("nnn");
				
				System.out.println("Congrats !");
				
				person[tmp].setName(name);
				
//				System.out.println(person[tmp]);
//				person[tmp].setTicket((person[tmp].getTicket() + n));
				
				total = total - n;
			}
//			else if((person[tmp].getTicket() + n)<=total){
//				
//				System.out.println("Invalid Attemp !");
//			}	
		}
		System.out.println("No tickets Avialable !");
	}
}
