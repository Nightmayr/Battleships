import java.util.HashMap;

public class BoatInfo {
	
	private String description;
	private int size;

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
	
	public BoatInfo(String description, int size) {
		this.description = description;
		this.size = size;
	}

	public String getDescription() {
		return description;
	}

	public int getSize() {
		return size;
	}
	
	public static int getSizeS(BoatType b) {
		return boatInfo.get(b).getSize();
	}
	
	public char getSymbol() {
		return description.charAt(0);
	}

	public static char getSymbolS(BoatType b) {
		return boatInfo.get(b).getDescription().charAt(0);
	}
	
	
}
