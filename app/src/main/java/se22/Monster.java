package se22;

public class Monster {
  public enum Type {
    fire,
    water,
    Grass,
    ;
  }

  private String name;
  private int rare; // 戦うとレア度が高い方が勝つ．同じ場合は引き分け
  private Type type;

  public Monster(int nameNum, int rareNum) {
    this.name = this.summonMonster(nameNum);
    this.rare = rareNum;
    this.type = this.monsterType(nameNum);
  }

  String summonMonster(int mnumber) {
    String monsters[] = { "スライム", "サハギン", "ドラゴン", "デュラハン", "シーサーベント" };
    return monsters[mnumber];
  }

  Type monsterType(int nameNum) {
    Type types[] = { Type.water, Type.Grass, Type.fire, Type.water, Type.water };
    return types[nameNum];
  }

  public int Attack() {
    return this.rare;
  }

  public Type GetType() {
    return this.type;
  }

  @Override
  public String toString() {
    return this.name + ":レア度[" + this.rare + "]\n";
  }
}
