import java.util.Scanner;

public class Player {


	private String name;
	
	Board board = new Board();
	
	public Player(String name) {
		this.name = name;
	}
	
	
	// Set boat location
	public String[] boatPlacement() {
		String boatChoice;
		String[] boatOptions;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter boat placement");
		System.out.print(">");
		boatChoice = sc.next().toUpperCase();
		boatOptions = boatChoice.split(",");
		sc.close();
		
		return boatOptions;
	}
}