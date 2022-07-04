package se22;

public class MonsterShow {
  private Monster monster_list[] = new Monster[5];

  public void showMonsterName() {
    monster_list = new MonsterList().generetMonsters();

    for (int i = 0; i < 5; i++) {
      mons = new Monster(i, i);
      monsters[i] = mons;
    }
  }
}
