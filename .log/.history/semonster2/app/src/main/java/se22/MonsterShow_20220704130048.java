package se22;

public class MonsterShowName {
  private Monster monster_list[] = new Monster[5];

  public void showMonsterName() {
    monster_list = new MonsterList().generetMonsters();

    for (int i = 0; i < 5; i++) {
      System.out.println("MonsterName is " + monster_list[i]);
    }
  }
}
