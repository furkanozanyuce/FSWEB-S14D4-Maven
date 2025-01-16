package org.example.rpg;

public class RpgMain {
    public static void main(String[] args) {
        Troll troll = new Troll("High Troll", 100, 20.0);
        Werewolf werewolf = new Werewolf("Blood Moon Werewolf", 120, 25.0);

        System.out.println(troll.getName() + " saldırıyor: " + troll.attack() + " damage vurdu!");
        System.out.println(werewolf.getName() + " saldırıyor: " + werewolf.attack() + " damage vurdu!");
    }
}
