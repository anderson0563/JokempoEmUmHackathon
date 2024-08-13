/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VF;

import java.util.Random;

public class Player implements Runnable{

    public String choice;
    static int players;
    int id;
    
    public Player(){
        id = players++;
    }
    
    String goString(int n) {
        switch(n) {
            case 8:
                return "rock";
            case 13:
                return "Spock";
            case 21:
                return "paper";
            case 34:
                return "lizard";
            case 55:
                return "scissors";
            default:
                return "Ops!";
        }
    }
    
    private int jumanji(int picked){
        if(picked<8) return 8;
        if(picked>8 && picked<13)
            return Math.floorDiv(picked+1, 2)>5?13:8;
        if(picked>13 && picked<21)
            return Math.floorDiv(picked, 2)>8?21:13;
        if(picked>21 && picked<34)
            return Math.floorDiv(picked, 2)>13?34:21;
        if(picked>34 && picked<55)
            return Math.floorDiv(picked+1, 2)>21?55:34;
        return picked;
    }
    
    @Override
    public void run() {
        Random chaos = new Random();
        int i=0;
        choice = goString(jumanji(i=chaos.nextInt(55)));
        System.out.println("pick " + id + " chose " + choice);
    }
    
}
