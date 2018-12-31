import java.util.HashMap;

public class Boat {
	
	private Coord coord;
	private char orientation;
	private BoatType boatType;
	
	
	public static final HashMap<BoatType, BoatInfo> boatInfo;
	static
	{
		boatInfo = new HashMap<BoatType,BoatInfo>();
		boatInfo.put(BoatType.PATROLBOAT, new BoatInfo("Patrol Boat", 2));
		boatInfo.put(BoatType.BATTLESHIP, new BoatInfo("Battleship",3));
		boatInfo.put(BoatType.SUBMARINE, new BoatInfo("Subamarine", 3));
		boatInfo.put(BoatType.DESTROYER, new BoatInfo("Destroyer", 4));
		boatInfo.put(BoatType.CARRIER, new BoatInfo("Carrier", 5));
	}
	
	
	public Boat(BoatType boatType, char orientation, int x, int y) {
		this.boatType = boatType;
		this.orientation = orientation;
		coord = new Coord(x, y);
		
	}


	public Coord getCoord() {
		return coord;
	}
	
//	public void setCoord(Coord coord) {
//		this.coord = coord;
//	}


	public char getOrientation() {
		return orientation;
	}

//	public void setOrientation(char orientation) {
//	this.orientation = orientation;
//}


	public BoatType getBoatType() {
		return boatType;
	}


//	public void setBoatType(BoatType boatType) {
//		this.boatType = boatType;
//	}



	
	
	

}
