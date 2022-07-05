package se22;

public class Player {
  private Monster deck[] = new Monster[5];
  private String name;

  Player() {
    name = "user1";
    deck = new MonsterList().generetMonsters();
  }

  
}
