package com.gamespringboot.game.game;

import org.springframework.stereotype.Component;

@Component
public class ContraGame implements GameConsole {
    public void up() {
        System.out.println("Contra UP");
    }
    public void down() {
        System.out.println("Contra Down");
    }
    public void left() {
        System.out.println("Contra Left");
    }
    public void right() {
        System.out.println("Contra Right");
    }
}
