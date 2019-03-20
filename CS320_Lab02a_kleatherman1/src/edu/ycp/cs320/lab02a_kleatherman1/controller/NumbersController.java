package edu.ycp.cs320.lab02a_kleatherman1.controller;

import edu.ycp.cs320.lab02a_kleatherman1.model.Numbers;

public class NumbersController {
	
	private Numbers model;
	
	public void setModel(Numbers model) {
		this.model= model;
	}
	
	public void getSum() {
		model.setResult(model.getNum1()+model.getNum2()+model.getNum3());
	}
	public void getProduct() {
		model.setResult(model.getNum1()*model.getNum2());
	}
}
