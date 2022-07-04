package se22;

public class MonsterTest {
  @Test
  void testSummonMonster() {
    Monster monster = new Monster(2, 2);
    assertNotNull(monster.getGreeting(), "Hello World!");
  }
}
