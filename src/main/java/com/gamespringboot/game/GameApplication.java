package com.gamespringboot.game;

import com.gamespringboot.game.game.ContraGame;
import com.gamespringboot.game.game.GameConsole;
import com.gamespringboot.game.game.GameRunner;
import com.gamespringboot.game.game.MarioGame;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GameApplication {

	public static void main(String[] args) {
		GameConsole marioGame = new MarioGame();
		GameConsole contraGame = new ContraGame();
		GameRunner game = new GameRunner(contraGame);
		game.runner();
	}

}
