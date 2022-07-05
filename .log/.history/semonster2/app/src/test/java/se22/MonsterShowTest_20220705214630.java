package se22;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MonsterShowTest {
  MonsterShow testMonsterShow = new MonsterShow();

  @Test
  void testShowMonsterName() {
    assertNotNull(testMonsterShow.showMonsterName(), "\nShow monster name...\nMonsterName is スライム:レア度[0]MonsterName is サハギン:レア度[1]MonsterName is ドラゴン:レア度[2]MonsterName is デュラハン:レア度[3]");
  }
}
