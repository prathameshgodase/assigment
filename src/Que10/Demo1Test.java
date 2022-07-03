package Que10;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Demo1Test {

	@Test
	void test() {
		assertEquals("apple-orange-banana-lemon",Demo1.concat(new String[] {"apple","orange","banana","lemon"}));
	}

}
