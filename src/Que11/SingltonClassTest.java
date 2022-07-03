package Que11;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import Que11.Singlton.SingltonCheck;

class SingltonClassTest {

	@Test
	void test() {

   Singlton st1=Singlton.getSinglton();
   Singlton st2=Singlton.getSinglton();
   assertTrue(SingltonCheck.Checksinglton(st1, st2));
		
		
	}
}
