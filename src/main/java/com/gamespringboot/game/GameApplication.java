package com.gamespringboot.game;

import com.gamespringboot.game.game.ContraGame;
import com.gamespringboot.game.game.GameConsole;
import com.gamespringboot.game.game.GameRunner;
import com.gamespringboot.game.game.MarioGame;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class GameApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(GameApplication.class, args);
		GameRunner game = context.getBean(GameRunner.class);
		game.runner();
	}

}
