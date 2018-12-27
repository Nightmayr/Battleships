
public class Board {
	
	private String[][] board = new String[3][3];
	
	public void createBoard() {
		for(int x = 0; x<3; x++) {
			for(int y = 0; y<3; y++) {
				this.board[x][y]="~";
			}
		}
		
	}
	
	public void printBoard() {
		for(int x = 0; x<this.board.length; x++) {
			for(int y=0; y<this.board.length; y++) {
				System.out.print(" " + this.board[x][y]);
			}
			System.out.println("");
		}
	}
	
	public void updateBoard(Boat boat) {
		
		
		
		if(boat instanceof PatrolBoat) {
			
		}
		
	}

	public String[][] getBoard() {
		return board;
	}

	public void setBoard(String[][] board) {
		this.board = board;
	}

}
