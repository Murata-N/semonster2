package se22;

public class MonsterList {
  Monster monsters[] = new Monster[5];

  public Monster[] generetMonsters() {
    Monster mons;
    for(int i=0,i<5;i++){
      mons = new Monster(i, i);
      monsters[i] = mons;
    }

    return monsters;
  }

  public static void main() {
  }
}
