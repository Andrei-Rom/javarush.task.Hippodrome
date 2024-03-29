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

        game.run();
        game.printWinner();
    }

    public List<Horse> getHorses() {
        return horses;
    }

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public void run(){
        for (int i = 1; i <= 100; i++) {
            this.move();
            this.print();
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void move(){
        horses.forEach(Horse::move);
    }
    public void print(){
        horses.forEach(Horse::print);
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
    }

    public Horse getWinner(){
        double maxDistanc = 0.0;
        Horse winner = null;
        for (int i = 0; i < horses.size(); i++) {
            if (horses.get(i).getDistance() > maxDistanc) {
                maxDistanc = horses.get(i).getDistance();
                winner = horses.get(i);
            }
        }
        return winner;
    }

    public void printWinner(){
        System.out.println("Winner is " + getWinner().getName() + "!");
    }

}
