package com.gamespringboot.game;

import com.gamespringboot.game.game.ContraGame;
import com.gamespringboot.game.game.GameRunner;
import com.gamespringboot.game.game.MarioGame;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GameApplication {

	public static void main(String[] args) {
//		SpringApplication.run(GameApplication.class, args);
		MarioGame marioGame = new MarioGame();
		ContraGame contraGame = new ContraGame();
		GameRunner game = new GameRunner(marioGame);
		game.runner();
	}

}
