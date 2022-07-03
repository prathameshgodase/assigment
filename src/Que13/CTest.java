package Que13;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CTest {

	   @Test
	   void test() {
	   assertEquals(130,Calculator.addtion(10, 120));

	   }
	   @Test
	   void test1() {
	       assertEquals(0.0, Calculator.division(6, 0));
	   }

	   @Test
	   void test2() {
	       assertEquals(-0, Calculator.multiplication(0, 10));
	   }
	   @Test
	   void test3() {
	       assertEquals(-25, Calculator.subtraction(-15, 10));
	   }
	   @Test
	   void test4() {
	       assertEquals(2.23606797749979, Calculator.squareroot(5));
	   }
	   @Test
	   void test5() {
	       assertEquals(25, Calculator.power(5, 2));
	   }@Test
	   void test6() {
	       assertEquals(15, Calculator.modulus(55, 20));

	   }
	   @Test
	   void test7() {
	       assertEquals(1.709975946676697, Calculator.cuberoot(5));

	}
	   
	}