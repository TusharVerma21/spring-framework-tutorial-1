package com.springpractical.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.springpractical.learnspringframework.game.GameRunner;
import com.springpractical.learnspringframework.game.GamingConsole;
import com.springpractical.learnspringframework.game.MarioGame;

@Configuration
public class GamingConfiguration {

	@Bean
	public GamingConsole game() {
		return new MarioGame();
	}
	
	@Bean
	public GameRunner gameRunner(GamingConsole game) {
		var gameRunner = new GameRunner(game);
		return gameRunner;
	}
	
	
}
