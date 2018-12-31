
public class Boat {
	
	private char orientation;
	private BoatType boatType;
	private int x, y;
	
	public Boat(BoatType boatType, char orientation, int x, int y) {
		this.boatType = boatType;
		this.orientation = orientation;
		this.x = x;
		this.y = y;
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
