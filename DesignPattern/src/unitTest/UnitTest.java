package unitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import chainOfResponsibility.*;

class UnitTest {

	@Test
	void test() {
		
		Chain chain1 = new AddNumbers();
		Chain chain2 = new SubNumbers();
		Chain chain3 = new MultNumbers();
		Chain chain4 = new DivNumbers();
		
		chain1.setNextChain(chain2);
		chain2.setNextChain(chain3);
		chain3.setNextChain(chain4);
		
		Numbers requests = new Numbers(12.0,3.0,"div");
		
//		assertEquals(7.0,chain1.calculate(requests));
		
//		assertEquals(9.0,chain1.calculate(requests));
//		assertEquals(36.0,chain1.calculate(requests));
		assertEquals(4.0,chain1.calculate(requests));
	}

}
