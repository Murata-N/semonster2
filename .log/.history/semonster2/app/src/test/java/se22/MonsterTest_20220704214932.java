package se22;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MonsterTest {
  @Test
  void appHasAGreeting() {
    int nameNum = 2;
    int rareNum = 2;
    Monster mosnter = new Monster(nameNum, rareNum);
    assertNotNull(classUnderTest.getGreeting(), "Hello World!");
  }
}
