package se22;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MonsterTest {
  @Test
  void testSummonMonster() {
    Monster monster = new Monster(2, 2);
    assertThat(monster.summonMonster(2), "ドラゴン");
  }
}
