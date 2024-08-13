/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VF;

import java.util.ArrayList;

public class BlueRedPill {
    
    public static String whoWins(String choose1, String choose2){
        ArrayList<String> knowledgeBase = new ArrayList<>();
        
        knowledgeBase.add("scissors cuts paper");
        knowledgeBase.add("paper covers rock");
        knowledgeBase.add("rock crushes lizard"); 
        knowledgeBase.add("lizard poisons Spock");
        knowledgeBase.add("Spock smashes scissors"); 
        knowledgeBase.add("scissors decapitates lizard");
        knowledgeBase.add("lizard eats paper");
        knowledgeBase.add("paper disproves Spock");
        knowledgeBase.add("Spock vaporizes rock");
        knowledgeBase.add("rock crushes scissors");
 

        String j1 =  choose1;
        String j2 = choose2;
        
        for(String rule1: knowledgeBase){
        
        if(rule1.startsWith(j1) && rule1.endsWith(j2))
            return "First player wins";
        else
            if(rule1.startsWith(j2) && rule1.endsWith(j1))
                return "Second player wins";
            else if(j1.equals(j2))
                    return "Tied game";
        }
        return "Shall not pass!";
    }
}
