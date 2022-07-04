package se22;

public class MonsterTest {
  @Test
  void testSummonMonster() {
    App classUnderTest = new App();
    assertNotNull(classUnderTest.getGreeting(), "Hello World!");
  }
}
