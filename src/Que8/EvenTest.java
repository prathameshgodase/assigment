package Que8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EvenTest {

	@Test
	void test() {
		assertEquals(6, EvenOfArray.CountingEvenodd(new int[] {2,6,4,6,3,22,4}));
	}

}
