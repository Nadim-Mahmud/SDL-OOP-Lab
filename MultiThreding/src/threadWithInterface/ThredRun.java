package threadWithInterface;

public class ThredRun {

	public static void main(String[] args) {
		
		RunableThread r1 = new RunableThread("Good");
		RunableThread r2 = new RunableThread("Bad");
		
		Thread th1 = new Thread(r1);
		Thread th2 = new Thread(r2);
		
//		th2.start();
//		th1.start();
		
		InteruptPractice ip = new InteruptPractice();
		
		Thread th = new Thread(ip);
		
		th.start();
		th.interrupt();
	}
}
