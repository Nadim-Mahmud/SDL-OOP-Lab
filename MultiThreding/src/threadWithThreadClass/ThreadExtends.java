package threadWithThreadClass;

import java.util.Date;

public class ThreadExtends extends Thread {
	
	public String str;
	
	public ThreadExtends(String st) {
		str = st;
	}
	
	public void run() {
		
		try {
			for(int i=1;i<=10&&!Thread.interrupted();i++) {
				
				Date now = new Date();	
				System.out.println(str + " " + now);
				Thread.sleep(500);
			}
			
		} catch (InterruptedException e) {
	
			e.printStackTrace();
		}
	}
}
