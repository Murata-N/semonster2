package se22;

public class MonsterTest {
  @Test
  void testSummonMonster() {
    assertNotNull(new Monster.summonMonster(2), "Hello World!");
  }
}
