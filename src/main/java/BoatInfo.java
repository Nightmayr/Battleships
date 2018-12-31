
public class BoatInfo {
	
	private String type;
	private int size;
	
	public BoatInfo(String type, int size) {
		this.type = type;
		this.size = size;
	}

	public String getType() {
		return type;
	}

	public int getSize() {
		return size;
	}
	
	public char getSymbol() {
		return type.charAt(0);
	}
	
	
	
}
