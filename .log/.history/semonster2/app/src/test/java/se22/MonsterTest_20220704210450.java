package se22;

public class MonsterTest {
  @Test
  void testSummonMonster() {
    assertThat(new Monster.summonMonster(2), "ドラゴン");
  }
}
