package com.gamespringboot.game.game;

import org.springframework.stereotype.Component;

@Component
public class PackmanGame implements GameConsole {
    public void up() {
        System.out.println("Packman UP");
    }
    public void down() {
        System.out.println("Packman Down");
    }
    public void left() {
        System.out.println("Packman Left");
    }
    public void right() {
        System.out.println("Packman Right");
    }
}
