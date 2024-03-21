package com.springpractical.learnspringframework.game;

public class NeedForSpeedGame implements GamingConsole{

	public void upButton() {
		System.out.println("Accelerate");
	}
	
	public void downButton() {
		System.out.println("Apply brakes");
	}
	
	public void leftButton() {
		System.out.println("Steer left");
	}
	
	public void rightButton() {
		System.out.println("Steer right");
	}
	
}
