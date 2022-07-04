package se22;

public class Monster {
  private String name;
  private int rare; // 戦うとレア度が高い方が勝つ．同じ場合は引き分け

  public Monster(int nameNum, int rareNum) {
    this.name = this.summonMonster(nameNum);
    this.rare = rareNum;
  }

  String summonMonster(int mnumber) {
    String monsters[] = { "スライム", "サハギン", "ドラゴン", "デュラハン", "シーサーベント" };
    return monsters[mnumber];
  }

  public int Attack() {
    return this.rare;
  }

  @Override
  public String toString() {
    return this.name + ":レア度[" + this.rare + "]\n";
  }
}
