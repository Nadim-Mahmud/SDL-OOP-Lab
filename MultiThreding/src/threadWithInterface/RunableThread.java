package threadWithInterface;

import java.util.Date;

public class RunableThread implements Runnable {
	
	public String str;
	
	public RunableThread(String st) {
		str = st;
	}
	
	public void run() {
	
		try {
			for(int i=1;i<=10;i++) {
				
				Date now = new Date();	
				System.out.println(str + " " + now);
				Thread.sleep(500);
			}
			
		} catch (InterruptedException e) {
	
			e.printStackTrace();
		}
	}
}
