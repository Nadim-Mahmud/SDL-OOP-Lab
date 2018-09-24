package threadWithInterface;

public class RunableThread implements Runnable {
	
	public String str;
	
	public RunableThread(String st) {
		str = st;
	}
	
	public void run() {
		
		for(int i=1;i<=10;i++) {
			System.out.println(str);
		}
	}
}
