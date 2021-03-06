package edu.ycp.cs320.lab02a_kleatherman1.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.ycp.cs320.lab02a_kleatherman1.model.GuessingGame;

public class GuessingGameTest {
	private GuessingGame model;
	
	@Before
	public void setUp() {
		model = new GuessingGame();
	}
	
	@Test
	public void testSetMin() {
		model.setMin(1);
		assertEquals(1, model.getMin());
	}
	@Test
	public void testSetMax() {
		model.setMax(100);
		assertEquals(100, model.getMax());
	}
	@Test
	public void testisDone() {
		model.isDone();
		assertEquals(model.getMax(),model.getMin());
	}
	@Test
	public void testisLessThan() {
		int temp= model.getGuess();
		model.setIsLessThan(temp);
		assertEquals(model.getMax(),temp-1);
	}
	@Test
	public void testisGreaterThan() {
		int temp= model.getGuess();
		model.setIsGreaterThan(temp);
		assertEquals(model.getMin(),temp+1);
	}
}
