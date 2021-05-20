package com.batorus.designpatterns.DesignPatterns.State.TVControl;

public class TVStateON implements State {

	@Override
	public void doAction() {
		System.out.println("TV is turned ON");
	}

}