package se22;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MonsterTest {
  int nameNum = 2;
  int rareNum = 2;
  Monster monster = new Monster(nameNum, rareNum);

  @Test
  void testSummonMonster() {
    assertNotNull(monster.summonMonster(nameNum), "ドラゴン");
  }


}
