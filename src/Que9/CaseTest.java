package Que9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CaseTest {

	@Test
	void test() {
		assertEquals("This  Red car",RemoveCase.check("This @ Red $car-"));
	}

}
