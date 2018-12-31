import java.util.ArrayList;
import java.util.List;

public class Game {
	
	
	public static void main(String[] args) {
		List<Player> players = new ArrayList<Player>();
		List<BoatType> fleet = new ArrayList<>();
		
		fleet.add(BoatType.PATROLBOAT);
		fleet.add(BoatType.PATROLBOAT);
		fleet.add(BoatType.BATTLESHIP);
		fleet.add(BoatType.BATTLESHIP);
		fleet.add(BoatType.SUBMARINE);
		fleet.add(BoatType.DESTROYER);
		fleet.add(BoatType.CARRIER);
		
		
		//Initialise First player
		Player p1 = new Player("umayr");
		CoordInfo[][] p1Board = p1.board.getBoard();
		//Place Fleet
		
		//Likewise for second player
		//Enter while loop player 1 shoot, player 2 shoot
	}
	
	
	
	public void placementMessage() {
		System.out.println("Enter boat placement using the format: orientation(v or h),x coordinate,y coordinate");
		System.out.println("Example: v,1,1");
		System.out.println("Boat will extend to the right or down respective of orientation choice");
	}
	

}
