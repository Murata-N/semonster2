package se22;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MonsterTest {
  @Test
  void testSummonMonster() {
    int nameNum = 2;
    int rareum = 2;
    Monster monster = new Monster(namenum, rarenum);
    assertNotNull(monster.summonMonster(2), "ドラゴン");
  }
}
