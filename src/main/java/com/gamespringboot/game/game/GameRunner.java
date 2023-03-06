package com.gamespringboot.game.game;

public class GameRunner {
    private MarioGame game;

    public GameRunner(MarioGame marioGame) {
        this.game = marioGame;
    }
    public void runner() {
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
