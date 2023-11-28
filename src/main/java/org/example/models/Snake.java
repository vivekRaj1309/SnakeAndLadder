package org.example.models;

public class Snake extends SpecialEntity{
    private int startPosition;
    private int endPosition;

    Snake(int startPosition, int endPosition){
        super(Type.SNAKE);
        this.startPosition = startPosition;
        this.endPosition = endPosition;
    }
    @Override
    public int getStartPosition() {
        return this.startPosition;
    }

    @Override
    public int getEndPosition() {
        System.out.println("You have been bit by Snake :(");
        return this.endPosition;
    }

}
