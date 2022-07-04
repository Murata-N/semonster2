package se22;

public class MonsterTest {
  @Test
  void testSummonMonster() {
    Monster monster = new Monster(2, 2);
    assertThat(new Monster.summonMonster(2), "ドラゴン");
  }
}
