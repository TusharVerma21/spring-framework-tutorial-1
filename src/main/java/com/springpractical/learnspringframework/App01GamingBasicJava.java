package com.springpractical.learnspringframework;

import com.springpractical.learnspringframework.game.GameRunner;
import com.springpractical.learnspringframework.game.MarioGame;
import com.springpractical.learnspringframework.game.NeedForSpeedGame;
import com.springpractical.learnspringframework.game.PacManGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {
		
		var marioGame = new MarioGame();
		var racingGame = new NeedForSpeedGame(); // Object Creation
		var pacmanGame = new PacManGame();
		var gameRunner = new GameRunner(pacmanGame); // Object Creation + wiring of dependencies
		// game is a dependency of gameRunner
		gameRunner.run();
		
		
	}

}
