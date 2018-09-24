package threadWithInterface;

public class InteruptPractice implements Runnable {

	public void run() {
		try {
			System.out.println(1);
			Thread.sleep(1000); /// after sleeping delay it will be inturupted
			System.out.println(2);
		}
		catch (InterruptedException exception){
			
			System.out.println(3);
		}
		System.out.println(4);
	}

}
