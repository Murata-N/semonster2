package se22;

public class Player {
  private Monster monster_list[] = new Monster[5];

  private String name;


  public void showMonsterName() {
    monster_list = new MonsterList().generetMonsters();

    System.out.println("\nShow monster name...");
    for (int i = 0; i < 5; i++) {
      System.out.print("MonsterName is " + monster_list[i]);
    }
    System.out.println();
  }
}
}
