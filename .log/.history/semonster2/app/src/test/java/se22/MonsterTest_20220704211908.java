package se22;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MonsterTest {
  @Test
  void testSummonMonster() {
    int namenum = 2;
    int rarenum = 2;
    Monster monster = new Monster(namenum, rarenum);
    assertNotNull(monster.summonMonster(2), "ドラゴン");
  }
}
