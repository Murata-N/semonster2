package se22;

public class MonsterShow {
  private Monster monster_list[] = new Monster[5];

  public void showMonsterName() {
    monster_list = new MonsterList().generetMonsters();

    
    for (int i = 0; i < 5; i++) {
      System.out.print("MonsterName is " + monster_list[i]);
    }
    System.out.println();
  }
}
