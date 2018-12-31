import java.util.Scanner;

public class Player {


	private String name;
	
	Board board = new Board();
	
	public Player(String name) {
		this.name = name;
	}
	
	
	
	
//	public void playerStrike() {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter x coordinate");
//		setxChoice(sc.nextInt());
//		System.out.println("Enter y coordinate");
//		setyChoice(sc.nextInt());
//		sc.close();
//	}
//	
//	// Set boat location
//	public void boatPlacement() {
//		String boatChoice;
//		String[] boatOptions;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter boat placement");
//		System.out.print(">");
//		boatChoice = sc.next().toUpperCase();
//		boatOptions = boatChoice.split(",");
//		
//		Boat patrol1 = new Boat(BoatType.PATROLBOAT, boatOptions[0].charAt(0), Integer.parseInt(boatOptions[1]), Integer.parseInt(boatOptions[2]));
//		BoatType type = patrol1.getBoatType();
//		board.setBoard(board[patrol1.getX()][patrol1.getY()]) = 
//		sc.close();
//	}
}