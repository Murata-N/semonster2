package se22;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MonsterTest {
  @Test
  void testSummonMonster() {
    int namenum = 2;
    int 
    Monster monster = new Monster(2, 2);
    assertNotNull(monster.summonMonster(2), "ドラゴン");
  }
}
