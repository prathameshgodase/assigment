package Que3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmailTest {

	@Test
	void test() {
		assertEquals(true,Email.check("pg15@gmail.com"," As@12"));
		}

}
