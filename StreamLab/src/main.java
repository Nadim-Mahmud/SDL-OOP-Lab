
public class main {

	public static void main(String[] args) {
		
		HowManyWordThe the = new HowManyWordThe();
		
		System.out.println("19.1 : " + the.counter());
		System.out.println("19.2 : " + new TheInFullFile().counter());
		System.out.println("19.3 : ");
		new ThirdPrintAllLineContainsThe().print();
		System.out.print("19.4 : ");
		new FourthAllDisticnt().distinct();

	}

}
