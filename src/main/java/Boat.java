
public class Boat {
	
	private char orientation;
	private BoatType boatType;
	private int x, y;
	
	public Boat(BoatType boatType, char orientation, int x, int y, CoordInfo[][] board ) throws Exception {
		this.boatType = boatType;
		this.orientation = orientation;
		this.x = x;
		this.y = y;
		board[x][y].setBoat(this);
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
