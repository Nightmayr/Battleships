
public class Board {
	
	public final int boardXSize = 3;
	public final int boardYSize = 3;
	
	private CoordInfo[][] board = new CoordInfo[boardXSize][boardYSize];
//	private char[][] board = new char[boardXSize][boardYSize];
	
	public void createBoard() {
		for(int x = 0; x<boardXSize; x++) {
			for(int y = 0; y<boardYSize; y++) {
				this.board[x][y] = new CoordInfo();
				
			}
		}
		
	}
	
	public void printBoard() {
		for(int x = 0; x<this.board.length; x++) {
			for(int y=0; y<this.board.length; y++) {
				Boat boat = board[x][y].getBoat();
				if (boat != null) {
					BoatType bt = boat.getBoatType();
					char boatSymbol = BoatInfo.getSymbolS(bt);
					System.out.print(" " + boatSymbol);
				} else {
					System.out.print(" ~");
				}
			}
			System.out.println(" " + (this.board.length-x-1));
		}
		for(int x = 0; x<this.board.length;x++) {
			System.out.print(" " + x);
		}
		System.out.println("");
	}
			

	public CoordInfo[][] getBoard() {
		return board;
	}

	public void setBoard(CoordInfo[][] board) {
		this.board = board;
	}

}
