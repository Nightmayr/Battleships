import java.util.Scanner;

public class Game {
	
	Player player = new Player();
	PatrolBoat patrol1 = new PatrolBoat(2);
	PatrolBoat patrol2 = new PatrolBoat(2);
	Battleship battleship1 = new Battleship(3);
	Battleship battleship2 = new Battleship(3);
	Submarine sub = new Submarine(3);
	Destroyer destroyer = new Destroyer(4);
	Carrier carrier = new Carrier(5);
	Board board = new Board();
	
	public void gameStart() {
		board.createBoard();
		board.printBoard();
		
		
	}
	

}
