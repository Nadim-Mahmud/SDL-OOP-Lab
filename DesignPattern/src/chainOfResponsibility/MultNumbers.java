package chainOfResponsibility;

public class MultNumbers implements Chain {

	private Chain nextChain;

	@Override
	public void setNextChain(Chain nextChain) {
		this.nextChain = nextChain;
	}

	@Override
	public double calculate(Numbers requests) {
		
		if(requests.getCalculationWanted()=="mult") {
			
			return  requests.getNumber1() * requests.getNumber2() ;
		}
		else {
			
			return nextChain.calculate(requests);
		}
	}

}
