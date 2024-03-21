package com.springpractical.learnspringframework.game;

public class MarioGame implements GamingConsole {

	public void upButton() {
		System.out.println("Jump");
	}
	
	public void downButton() {
		System.out.println("Crouch");
	}
	
	public void leftButton() {
		System.out.println("Go back");
	}
	
	public void rightButton() {
		System.out.println("Go forward");
	}
	
}
