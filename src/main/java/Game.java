public class Game {
	
	Player player = new Player();
	Board board = new Board();
	
	public void gameStart() {
		
		board.printBoard();
		this.placementMessage();
		player.boatPlacement();
		board.printBoard();
		
	}
	
	public void placementMessage() {
		System.out.println("Enter boat placement using the format: orientation(v or h),x coordinate,y coordinate");
		System.out.println("Example: v,1,1");
		System.out.println("Boat will extend to the right or down respective of orientation choice");
	}
	

}
