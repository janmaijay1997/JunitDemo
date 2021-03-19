package com.intent.JunitDemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MathUtilsTest {
	MathUtils mathUtils;
	@BeforeEach
	void intalizeBeforeEach() {
		 mathUtils=new MathUtils();
	}

	@Test
	void testAdd() {
	
		int expected=20;
		int actual=mathUtils.add(5, 15);
		assertEquals(expected, actual);
		//fail("Not yet implemented");
	}
	
	@Test
	void testComputeCircleArea() {
		
		double expected=3.14;
		double actual=mathUtils.computeCircleArea(1);
		assertEquals(expected, actual);
	}

}
