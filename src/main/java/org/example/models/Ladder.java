package org.example.models;

public class Ladder extends SpecialEntity{
    private int startPosition;
    private int endPosition;

    public Ladder(int startPosition, int endPosition) {
        super(Type.lADDER);
        this.startPosition = startPosition;
        this.endPosition = endPosition;
    }

    @Override
    public int getStartPosition() {
        return startPosition;
    }

    @Override
    public int getEndPosition() {
        System.out.println("You found a ladder. Yay!!");
        return endPosition;
    }
}
