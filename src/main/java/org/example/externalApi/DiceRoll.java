package org.example.externalApi;

public class DiceRoll implements Dice{
    @Override
    public int roll() {
        return (int)Math.floor(Math.random() * 7);
    }
}
