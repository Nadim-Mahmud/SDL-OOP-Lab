package unitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.SpeedValidate;

class JunitTest {

	@Test
	void test() {
		
		SpeedValidate sp = new SpeedValidate();
		
		assertEquals(10,sp.maxSpeed(1));
		assertEquals(1,sp.maxSpeed(2));
	}

}
