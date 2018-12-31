import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class BattleshipTest {
	
	Game game;
	Player player;
	Board board;
	Boat patrol1;
	
	@Before
	public void setup() {
		player = new Player();
		game = new Game();
		board = new Board();
		patrol1 = new Boat(BoatType.PATROLBOAT, 'v', 1, 1);
	}
	
	@Test @Ignore
	public void fail() {
		fail();
	}
	
	@Test
	public void boatCoordTest() {
		int boatX = patrol1.getCoord().getX();
		int boatY = patrol1.getCoord().getY();
		assertEquals(1,boatX);
		assertEquals(1,boatY);
	}
	
	@Test
	public void boatSizeTest() {
		int boatSize = patrol1.boatInfo.get(patrol1.getBoatType()).getSize();
		assertEquals(2,boatSize);
	}
	
	@Test
	public void horizontalBoundTest() {
		assertTrue((patrol1.getCoord().getX()>=0) && (patrol1.getCoord().getX()+patrol1.boatInfo.get(patrol1.getBoatType()).getSize()-1<=board.getBoard()[0].length));
	}
	
	@Test
	public void verticalBoundTest() {
		assertTrue((patrol1.getCoord().getY()>=0) && (patrol1.getCoord().getY()+patrol1.boatInfo.get(patrol1.getBoatType()).getSize()+1<=board.getBoard()[0].length));
	}
	
	@Test
	public void boatSymbolTest() {
		char boatSymbol = patrol1.boatInfo.get(patrol1.getBoatType()).getSymbol();
		assertEquals('P', boatSymbol);
	}

	
}
