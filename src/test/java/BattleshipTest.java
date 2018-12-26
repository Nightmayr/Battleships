import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class BattleshipTest {
	
	Game game;
	
	@Before
	public void setup() {
		game = new Game();
	}
	
	@Test @Ignore
	public void fail() {
		fail();
	}
	
	@Test
	public void userInputTest() {
		game.userStrike();
		assertEquals(1, game.getxChoice());
		assertEquals(2, game.getyChoice());
	}
	
	
	
}
