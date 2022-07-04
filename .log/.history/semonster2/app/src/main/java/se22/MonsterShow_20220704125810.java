package se22;

public class MonsterShow {
  public void showMonsterName() {

    monster_list = new MonsterList().generetMonsters();
    System.out.println(monster_list[1]);
  }
}
