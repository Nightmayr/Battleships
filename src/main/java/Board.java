
public class Board {
	
	public final int boardXSize = 3;
	public final int boardYSize = 3;
	
	private CoordInfo[][] board = new CoordInfo[boardXSize][boardYSize];
	
	public Board() {
		for(int x = 0; x<boardXSize; x++) {
			for(int y = 0; y<boardYSize; y++) {
				this.board[x][y] = new CoordInfo();
			}
		}
	}
	
	public void printBoard() {
		for(int x = 0; x<this.board.length; x++) {
			for(int y=0; y<this.board.length; y++) {
				Boat boatObj = board[x][y].getBoatObj();
				if (boatObj != null) {
					System.out.print(" " + this.board[x][y].getBoatObj().boatInfo.get(BoatType.PATROLBOAT).getSymbol());
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
