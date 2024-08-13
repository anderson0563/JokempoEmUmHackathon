/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VF;

import java.util.ArrayList;

public class TriviaGame {
    public static void main(String[] args){
        ArrayList<Player> players = new ArrayList<>();
        ArrayList<Thread> virtualPlayers = new ArrayList<>();
        
        for(int i=0; i<2; i++){
            players.add(new Player());
            virtualPlayers.add(new Thread(players.get(i)));
            virtualPlayers.get(i).start();
        }
        try{
            for(int i=0; i<2; i++){
                (virtualPlayers.get(i)).join();
            }
        }catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        System.out.println(BlueRedPill.whoWins(players.get(0).choice, players.get(1).choice));
    }
}
