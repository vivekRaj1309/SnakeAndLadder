package org.example.models;

import java.util.HashMap;
import java.util.Map;

public class Board {
    private int size;
    private Map<Integer, SpecialEntity> specialEntityMap;

    Board(int size){
        this.size = size;
        specialEntityMap = new HashMap<>();
        fillSnakeLadder();
    }

    public int getSize() {
        return size;
    }

    public Map<Integer, SpecialEntity> getSpecialEntityMap() {
        return specialEntityMap;
    }


    public void fillSnakeLadder(){
        int minSnakeCell = 2;
        int minLadderCell = 4;
        for(int snakeCount = 0; snakeCount <= (8 * this.size)/100; snakeCount++){
            int max = (int)Math.floor(Math.random() * size/2);
            if(minSnakeCell + max <= size-1) {
                SpecialEntity specialEntity = new Snake(minSnakeCell + max, minSnakeCell);
                specialEntityMap.put(minSnakeCell + max, specialEntity);
                minSnakeCell = max + (int) Math.floor(Math.random() * 5);
            }
        }
        for(int ladderCount = 0; ladderCount <= (8 * this.size)/100; ladderCount++){
            int max = (int)Math.floor(Math.random() * size/2);
            if(max >= size) break;
            if(!specialEntityMap.containsKey(minLadderCell)) {
                SpecialEntity specialEntity = new Ladder(minLadderCell, minLadderCell + max);
                specialEntityMap.put(minLadderCell, specialEntity);
                minLadderCell = max + (int)Math.floor(Math.random() * 5);
            }
        }
    }
}
