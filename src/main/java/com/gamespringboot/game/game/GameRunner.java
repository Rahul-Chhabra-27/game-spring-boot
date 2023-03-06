package com.gamespringboot.game.game;

public class GameRunner {
    private GameConsole game;

    public GameRunner(GameConsole marioGame) {
        this.game = marioGame;
    }
    public void runner() {
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
