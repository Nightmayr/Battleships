
public class Boat {
	
	private char orientation;
	private BoatType boatType;
	private int x, y;
	
	public Boat(BoatType boatType, char orientation, int x, int y, CoordInfo[][] board ) throws Exception {
		this.boatType = boatType;
		this.orientation = orientation;
		this.x = x;
		this.y = y;
		
		
		for(int i=0;i<BoatInfo.getSizeS(this.getBoatType());i++) {
			if(this.orientation=='V') {
				board[x][y-i].setBoat(this);							
			} else if(this.orientation=='H') {
				board[x+i][y].setBoat(this);
			} else {
				System.out.println("Invalid orientation entered");
			}
		}
	}

	public BoatType getBoatType() {
		return boatType;
	}

	public char getOrientation() {
		return orientation;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

}
