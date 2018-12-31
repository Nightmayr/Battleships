import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class BattleshipTest {
	
	Game game;
	Player player;
	Board board;
	Boat patrol1;
	Boat patrol2;
	
	@Before
	public void setup() {
		player = new Player();
		game = new Game();
		board = new Board();
		patrol1 = new Boat(BoatType.PATROLBOAT, 'v', 1, 1);
		patrol2 = new Boat(BoatType.PATROLBOAT, 'x', 1, 1);
	}
	
	@Test @Ignore
	public void fail() {
		fail();
	}
	
	@Test
	public void boatCoordTest() {
		int boatX = patrol1.getX();
		int boatY = patrol1.getY();
		assertEquals(1,boatX);
		assertEquals(1,boatY);
	}
	
	@Test
	public void boatSizeTest() {
		BoatType type = patrol1.getBoatType();
		int boatSize = BoatInfo.getSizeS(type);
		assertEquals(2,boatSize);
	}
	
	@Test
	public void horizontalBoundTest() {
		BoatType type = patrol1.getBoatType();
		int boatSize = BoatInfo.getSizeS(type);
		assertTrue((patrol1.getX()>=0) && (patrol1.getX()+boatSize-1<=board.getBoard()[0].length));
	}
	
	@Test
	public void verticalBoundTest() {
		BoatType type = patrol1.getBoatType();
		int boatSize = BoatInfo.getSizeS(type);
		assertTrue((patrol1.getY()>=0) && (patrol1.getY()+boatSize+1<=board.getBoard()[0].length));
	}
	
	@Test
	public void boatSymbolTest() {
		BoatType type = patrol1.getBoatType();
		char boatSymbol = BoatInfo.getSymbolS(type);
		assertEquals('P', boatSymbol);
	}
	
	@Test
	public void orientationTest() {
		char orientation = patrol1.getOrientation();
//		assertTrue(orientation );
	}
	

	
}
