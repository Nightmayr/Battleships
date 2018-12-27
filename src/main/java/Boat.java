
public abstract class Boat {
	
	private int xPos;
	private int yPos;
	private int size;
	private boolean boatHit;
	
//	public Boat() {
//		this.size = size;
//		
//	}
	
	public int getxPos() {
		return xPos;
	}
	
	public void setxPos(int xPos) {
		this.xPos = xPos;
	}
	
	public int getyPos() {
		return yPos;
	}
	
	public void setyPos(int yPos) {
		this.yPos = yPos;
	}


	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public boolean isBoatHit() {
		return boatHit;
	}

	public void setBoatHit(boolean boatHit) {
		this.boatHit = boatHit;
	}
	
	

}
