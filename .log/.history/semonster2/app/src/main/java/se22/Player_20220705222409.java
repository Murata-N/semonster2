package se22;

public class Player {
  private Monster deck[] = new Monster[5];
  private String name;

  Player(String str) {
    name = str;
    deck = generateDeck();
  }

  public void generateDeck() {
    Monster mons;
    for (int i = 0; i < 5; i++) {
      mons = new Monster(i, i);
      deck[i] = mons;
    }
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
