package se22;

public class Player {
  private Monster deck[] = new Monster[5];
  private String name;

  Player(String username="user1"){
    name = "username";

  }

  public void showMonsterName() {
    monster_list = new MonsterList().generetMonsters();

    System.out.println("\nShow monster name...");
    for (int i = 0; i < 5; i++) {
      System.out.print("MonsterName is " + monster_list[i]);
    }
    System.out.println();
  }
}}
