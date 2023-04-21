package com.levochka108.privat.ex.es2;

public class TwoPlayersGame extends Game {
    private final String playerName1;
    private final String playerName2;

    public TwoPlayersGame(String playerName, String playerName2) {
        this.playerName1 = playerName;
        this.playerName2 = playerName2;
    }

    public void printPlayerName1(){
        System.out.println(this.playerName1);
    }

    public void printPlayerName2(){
        System.out.println(this.playerName2);
    }
}
