package com.springpractical.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springpractical.learnspringframework.game.GameRunner;
import com.springpractical.learnspringframework.game.GamingConsole;
import com.springpractical.learnspringframework.game.MarioGame;
import com.springpractical.learnspringframework.game.NeedForSpeedGame;
import com.springpractical.learnspringframework.game.PacManGame;

public class App03GamingSpringBeans {

	public static void main(String[] args) {
		
		try(var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)){
			
			context.getBean(GamingConsole.class).upButton();
			context.getBean(GameRunner.class).run();
			//((GamingConsole) context.getBean("game")).upButton();
		}
		
		
		
//		var marioGame = new MarioGame();
//		var racingGame = new NeedForSpeedGame(); // Object Creation
//		var pacmanGame = new PacManGame();
//		var gameRunner = new GameRunner(pacmanGame); // Object Creation + wiring of dependencies
//		// game is a dependency of gameRunner
//		gameRunner.run();
		
		
	}

}
