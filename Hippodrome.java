package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {
    private List<Horse> horses;
    static Hippodrome game;

    public static void main(String[] args) {
        game = new Hippodrome(new ArrayList<>());
        Horse recco = new Horse("Recco", 3d, 0d);
        Horse racket = new Horse("Racket", 3d, 0d);
        Horse sharif = new Horse("Sharif", 3d,0d);
        game.getHorses().add(recco);
        game.getHorses().add(racket);
        game.getHorses().add(sharif);
        
    }

    public List<Horse> getHorses() {
        return horses;
    }

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }


}
