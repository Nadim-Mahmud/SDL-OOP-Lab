package threadWithThreadClass;

public class main {

	public static void main(String[] args) {
		
		ThreadExtends ex1 = new ThreadExtends("Nothing");
		ThreadExtends ex2 = new ThreadExtends("Something");
		
		ex1.start();
		ex2.start();
	}

}
