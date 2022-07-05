package se22;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MonsterShowTest {
  MonsterShow testMonsterShow = new MonsterShow();

  @Test
  void testShowMonsterName() {
    assertNotNull(testMonsterShow.showMonsterName(), "");
  }
}
