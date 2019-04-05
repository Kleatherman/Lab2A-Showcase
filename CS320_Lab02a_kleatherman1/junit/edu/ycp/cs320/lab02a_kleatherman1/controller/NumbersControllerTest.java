package edu.ycp.cs320.lab02a_kleatherman1.controller;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import edu.ycp.cs320.lab02a_kleatherman1.model.Numbers;



public class NumbersControllerTest {
	private Numbers model;
	private NumbersController controller;
	
	@Before
	public void setUp() {
		model = new Numbers();
		controller = new NumbersController();
		
		model.setNum1(5);
		model.setNum2(6);
		model.setNum3(7);
		
		controller.setModel(model);
	}
	
	@Test
	public void testGetSum() {
		controller.getSum();
		assertEquals(model.getResult(), 18,0);
	}
	@Test
	public void testGetProduct() {
		controller.getProduct();
		assertEquals(model.getResult(), 30, 0);
	}
}
