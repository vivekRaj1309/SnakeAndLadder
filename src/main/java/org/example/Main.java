package org.example;
import org.example.models.Game;
import org.example.service.GamePlay;
import org.example.service.GamePlayImplementation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Snake & Ladder");
        System.out.println("Press any key and enter to start the game");
        System.out.println("Enter the size of board and number of players who will play the game");
        int size = sc.nextInt();
        int playerCount = sc.nextInt();
        Game game = new Game(size, playerCount);
        for(int i = 0; i< playerCount; i++){
            System.out.println("Please enter first name of Player and email");
            String name = sc.next();
            String email = sc.next();
            game.addPlayer(name, email);
        }
        GamePlay gamePlay = new GamePlayImplementation(game);
        gamePlay.play();

//        Game game = new Game(101, 2);
//        Map<Integer, SpecialEntity> map = game.getBoard().getSpecialEntityMap();
//        for(int idx : map.keySet()){
//            System.out.println(idx + " || " + map.get(idx).getType() + " = " + map.get(idx).getStartPosition() + " : " + map.get(idx).getEndPosition());
//        }
    }
}