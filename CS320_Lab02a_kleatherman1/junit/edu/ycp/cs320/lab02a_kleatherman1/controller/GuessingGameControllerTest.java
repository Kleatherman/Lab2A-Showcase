package edu.ycp.cs320.lab02a_kleatherman1.controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import edu.ycp.cs320.lab02a_kleatherman1.controller.GuessingGameController;
import edu.ycp.cs320.lab02a_kleatherman1.model.GuessingGame;

public class GuessingGameControllerTest {
	private GuessingGame model;
	private GuessingGameController controller;
	
	@Before
	public void setUp() {
		model = new GuessingGame();
		controller = new GuessingGameController();
		
		model.setMin(1);
		model.setMax(100);
		
		controller.setModel(model);
	}
	
	@Test
	public void testNumberIsGreater() {
		int currentGuess = model.getGuess();
		controller.setNumberIsGreaterThanGuess();
		assertTrue(model.getGuess() > currentGuess);
	}
	@Test
	public void testSetNumberFound() {
		controller.setNumberFound();
		assertEquals(model.getMax(),model.getMin());
	}
	@Test
	public void testLessThanGuess() {
		int temp=model.getGuess();
		controller.setNumberIsLessThanGuess();
		assertEquals(model.getMax(),temp);
	}
	@Test
	public void testGreaterThenGuess() {
		int temp= model.getGuess();
		controller.setNumberIsGreaterThanGuess();
		assertEquals(temp,model.getMin());
	}
}
