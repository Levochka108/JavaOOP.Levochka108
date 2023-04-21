package com.levochka108.privat.ex.es2;

public class ThreePlayersGame {
    private final String playerName1;
    private final String playerName2;
    private final String playerName3;


    public ThreePlayersGame(String playerName1, String playerName2, String playerName3) {
        this.playerName1 = playerName1;
        this.playerName2 = playerName2;
        this.playerName3 = playerName3;
    }

    public void printPlayerName1(){
        System.out.println(this.playerName1);
    }

    public void printPlayerName2(){
        System.out.println(this.playerName2);
    }
    public void printPlayerName3(){
        System.out.println(this.playerName3);
    }
}
