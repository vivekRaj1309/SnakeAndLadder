package org.example.models;

import org.example.externalApi.Dice;
import org.example.externalApi.DiceRoll;

import java.util.LinkedList;
import java.util.Queue;


public class Game {
    private Queue<Player> playerList;
    private Board board;
    private Queue<Player> ranks;
    private Dice dice;
    private Player lastPlayerMoved;
    public Game(int size, int playersCount){
        board = new Board(size);
        playerList = new LinkedList<>();
        ranks = new LinkedList<>();
        dice = new DiceRoll();
        lastPlayerMoved = null;
    }
    public void addPlayer(String name, String email){
        playerList.add(new Player(new User(name, email)));
    }

    public Queue<Player> getPlayerList() {
        return playerList;
    }

    public void setPlayerList(Queue<Player> playerList) {
        this.playerList = playerList;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public Queue<Player> getRanks() {
        return ranks;
    }

    public void setRanks(Queue<Player> ranks) {
        this.ranks = ranks;
    }

    public Dice getDice() {
        return dice;
    }

    public void setDice(Dice dice) {
        this.dice = dice;
    }

    public Player getLastPlayerMoved() {
        return lastPlayerMoved;
    }

    public void setLastPlayerMoved(Player lastPlayerMoved) {
        this.lastPlayerMoved = lastPlayerMoved;
    }
}
