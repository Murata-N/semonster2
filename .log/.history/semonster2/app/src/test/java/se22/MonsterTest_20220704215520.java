package se22;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MonsterTest {
  @Test
  void testSummonMonster() {
    int nameNum = 2;
    int rareNum = 2;
    Monster monster = new Monster(nameNum, rareNum);
    assertNotNull(monster.summonMonster(nameNum), "ドラゴン");
  }

  @Test
  void appHasAGreeting() {
    int nameNum = 3;
    int rareNum = 3;
    Monster monster = new Monster(nameNum, rareNum);
    assertEquals(monster.Attack(), 3);
  }

  @Test
  void testToString() {
    int nameNum = 4;
    int rareNum = 4;
    Monster monster = new Monster(nameNum, rareNum);
    assertNotNull(monster.toString(), "シーサーベント:レア度[4]\n");
  }
}
