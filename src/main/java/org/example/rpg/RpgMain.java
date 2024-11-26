package org.example.rpg;

public class RpgMain {
    public static void main (String[] args) {
        Monster shrek = new Troll("shrek",1000,41.1) ;
        Monster wolf = new Werewolf("muammer",890,75);
//        Monster ibo = new Troll("ibo",1210,95);
printAttackResult(shrek);
printAttackResult(wolf);
    }
    private static void printAttackResult( Monster monster){
        System.out.println("attack result of " + monster.getName() + ":" + monster.attack()    );
    }
}
