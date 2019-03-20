package edu.ycp.cs320.lab02a_kleatherman1.model;


import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class NumberTest {
	private Numbers model;
	
	@Before
	public void setup() {
		model= new Numbers();
	}
	@Test
	public void testSetNum1() {
		model.setNum1(5);
		assertEquals(model.getNum1(),5, 0);
	}
	@Test
	public void testSetNum2() {
		model.setNum2(6);
		assertEquals(model.getNum2(), 6, 0);
		
	}
	@Test
	public void testSetNum3() {
		model.setNum3(7);
		assertEquals(model.getNum3(), 7, 0);
		
	}
	@Test
	public void testSetResult() {
		model.setResult(11);
		assertEquals(model.getResult(), 11, 0);
		
	}
}
