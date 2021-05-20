package com.batorus.designpatterns.DesignPatterns.State.TVControl;

public class TVStateOFF implements State {

	@Override
	public void doAction() {
		System.out.println("TV is turned OFF");
	}

}