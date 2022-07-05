package se22;

public class Player {
  private Monster deck[] = new Monster[5];
  private String name;

  Player() {
    name = "user";
    deck = new MonsterList().generetMonsters();
  }

  public void showDeck() {
    System.out.println("\nDeck:" + name);
    for (int i = 0; i < 5; i++) {
      System.out.print(deck[i]);
    }
    System.out.println();
  }

  public String getUserName

}
