package chainOfResponsibility;

public class DivNumbers implements Chain {

	private Chain nextChain;

	@Override
	public void setNextChain(Chain nextChain) {
		this.nextChain = nextChain;
	}

	@Override
	public double calculate(Numbers requests) {
		
		if(requests.getCalculationWanted()=="div") {
			
			return requests.getNumber1() / requests.getNumber2() ;
		}
		else {
			
			System.out.println("Only add,sub,mult,div are accepet");
		}
		
		return 0;
	}
}
