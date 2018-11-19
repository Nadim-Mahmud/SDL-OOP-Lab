package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import main.Sound;

class DistanceTest {

	@Test
	void test() {
		
		Sound soundCalc = new Sound();
		soundCalc.setData(7.2, 1100.0);
		
		assertEquals((7.2*1100.0) , soundCalc.distance());
	}

}
