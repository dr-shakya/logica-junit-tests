package tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class FirstTests {

	//terminates from the point where error is encountered
	
	
	@Test
	void firstTest() {
		final int value = 5;//only allows final value
		
		
		assertEquals(2, 1+1);
		assertEquals("Apple","Apple");
		assertFalse(2>3);
	}

}
