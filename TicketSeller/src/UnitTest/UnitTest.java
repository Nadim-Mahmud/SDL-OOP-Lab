package UnitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.TicketSeller;

class UnitTest {

	@Test
	void test() {
		
		TicketSeller tc =new TicketSeller();
		
		assertEquals(tc.BuyTicket(10), 90);
		assertEquals(tc.BuyTicket(15), 75);
		assertEquals(tc.BuyTicket(25), 55);
		assertEquals(tc.BuyTicket(5), 50);
		assertEquals(tc.BuyTicket(20), 30);
		assertEquals(tc.BuyTicket(20), 10);	
		assertEquals(tc.BuyTicket(10), 0);
		
		
	}

}
