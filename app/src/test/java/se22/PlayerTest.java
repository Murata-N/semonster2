package se22;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PlayerTest {
  @Test
  void testGetPlayerName() {
    String str = "user1";
    Player testPlayer = new Player(str);
    assertEquals(testPlayer.getPlayerName(), str);
  }
}
