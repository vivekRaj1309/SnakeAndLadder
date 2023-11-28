package org.example.service;

import org.example.models.Game;
import org.example.models.Player;
import org.example.models.SpecialEntity;

import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

public class GamePlayImplementation implements GamePlay{
    private Game game;

    public GamePlayImplementation(Game game){
        this.game = game;
    }
    @Override
    public void play() {
        while(game.getPlayerList().size() > 1){
            Player currPlayer = game.getPlayerList().poll();
            System.out.println();
            System.out.println(currPlayer.getUser().getName() + "'s turn");
            System.out.println("Press any key and press enter to roll the dice");
//            Scanner sc = new Scanner(System.in);
//            sc.next();
            move(currPlayer);
            game.setLastPlayerMoved(currPlayer);
        }
        System.out.println("Winner List");
        getWinnerList(game.getRanks());
    }

    private void getWinnerList(Queue<Player> winners) {
        for(Player player : winners){
            System.out.println("* " + player.getUser().getName() + " *");
        }
    }

    @Override
    public void move(Player currPlayer) {
        int currentPosition = currPlayer.getPosition();
        int steps = game.getDice().roll();
        System.out.println(currPlayer.getUser().getName() + " current position is " + currentPosition);
        System.out.println(currPlayer.getUser().getName() + " got " + steps + ". Making the move");
        int nextPosition = steps + currentPosition;
        Map<Integer, SpecialEntity> specialEntityMap = game.getBoard().getSpecialEntityMap();
        if(specialEntityMap.containsKey(nextPosition)){
            nextPosition = specialEntityMap.get(nextPosition).getEndPosition();
        }
        if(nextPosition >= game.getBoard().getSize()){
            System.out.println(currPlayer.getUser().getName() + " won");
            game.getRanks().add(currPlayer);
        } else {
            System.out.println("Your new position is " + nextPosition);
            currPlayer.setPosition(nextPosition);
            game.getPlayerList().add(currPlayer);
        }
    }
}
