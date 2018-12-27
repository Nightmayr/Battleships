import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class BattleshipTest {
	
	Game game;
	Player player;
	Board board;
	PatrolBoat patrol1;
	PatrolBoat patrol2;
	Battleship battleship1;
	Battleship battleship2;
	Submarine sub;
	Destroyer destroyer;
	Carrier carrier;
	
	@Before
	public void setup() {
		player = new Player();
		game = new Game();
		board = new Board();
		patrol1 = new PatrolBoat(2);
		patrol2 = new PatrolBoat(2);
		battleship1 = new Battleship(3);
		battleship2 = new Battleship(3);
		sub = new Submarine(3);
		destroyer = new Destroyer(4);
		carrier = new Carrier(5);
	}
	
	@Test @Ignore
	public void fail() {
		fail();
	}
	
	@Test
	public void boatHorizontalTest() {
		player.playerStrike();
		assertTrue(player.getxChoice()>=0 && player.getxChoice()+patrol1.getSize()-1<=board.getBoard()[0].length);
		
	}
	
	@Test
	public void verticalBoundTest() {
		player.playerStrike();
		assertTrue(player.getyChoice()>=0 && player.getyChoice()-patrol1.getSize()+1<=board.getBoard()[0].length);
	}
	
	@Test
	public void boatSizeTest() {
//		patrol1.boatSize();
		assertEquals(2, patrol1.getSize());
//		patrol1.getSize()
	}
	
//	@Test
//	public void boatBoardTest() {
//		patrol1.setxPos(0);
//		patrol1.setyPos(1);
//		board.updateBoard(patrol1);
//		assertEquals("B",board.getBoard());
//	}

	
	
	
}
