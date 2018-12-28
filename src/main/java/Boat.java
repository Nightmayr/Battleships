import java.util.HashMap;

public class Boat {
	
	private Coord coord;
	private char orientation;
	private BoatType boatType;
	
	public static final HashMap<BoatType, Integer> boatSize;
	static
	{
		boatSize = new HashMap<BoatType,Integer>();
		boatSize.put(BoatType.PATROLBOAT, 2);
		boatSize.put(BoatType.BATTLESHIP, 3);
		boatSize.put(BoatType.SUBMARINE, 3);
		boatSize.put(BoatType.DESTROYER, 4);
		boatSize.put(BoatType.CARRIER, 5);
	}
	
	
	public Boat(BoatType boatType, char orientation, int x, int y) {
		this.boatType = boatType;
		this.orientation = orientation;
		coord = new Coord(x, y);
		
	}
	
	
	
	

}
