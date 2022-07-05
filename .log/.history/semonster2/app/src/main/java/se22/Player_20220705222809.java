package se22;

import java.util.Random;

public class Player {
  private Monster deck[] = new Monster[5];
  private String name;

  Player(String str) {
    name = str;
    deck = new MonsterList().generetMonsters();
  }

  public Monster[] generatetDeck() {
    Monster mons;
    Monster newdeck[] = new Monster[5];
    Random rand = new Random();
    for (int i = 0; i < 5; i++) {
      mons = new Monster(rand.nextInt(5), rand.nextInt(5));
      newdeck[i] = mons;
    }
    return newdeck;
  }

  public void showDeck() {
    System.out.println("\nDeck:" + name);
    for (int i = 0; i < 5; i++) {
      System.out.print(deck[i]);
    }
    System.out.println();
  }

  public String getPlayerName() {
    return name;
  }

}
