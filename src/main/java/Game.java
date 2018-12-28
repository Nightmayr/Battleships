public class Game {
	
	Player player = new Player();
	Board board = new Board();
	Boat patrol1 = new Boat(BoatType.PATROLBOAT, 'v', 1, 1);
	
	public void gameStart() {
		board.createBoard();
		board.printBoard();
		this.placementMessage();
		player.boatPlacement(patrol1);
		board.printBoard();
		
	}
	
	public void placementMessage() {
		System.out.println("Enter boat placement using the format: orientation(v or h),x coordinate,y coordinate");
		System.out.println("Example: v,1,1");
		System.out.println("Boat will extend to the right or down respective of orientation choice");
	}
	

}
