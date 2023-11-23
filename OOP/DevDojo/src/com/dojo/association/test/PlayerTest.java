package com.dojo.association.test;

import com.dojo.association.domain.Player;

public class PlayerTest {
    public static void main(String[] args) {

        Player player01 = new Player("Romario");
        Player player02 = new Player("Ronaldo");
        Player player03 = new Player("Ronaldinho");

        Player[] players = {player01, player02, player03};

        for (Player player : players) {
            player.print();
            
        }
    }
}
