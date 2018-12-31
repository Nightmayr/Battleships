import java.util.Scanner;

public class Player {

	
	private int xChoice;
	private int yChoice;
	
	Board board = new Board();
	
	public void playerStrike() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x coordinate");
		setxChoice(sc.nextInt());
		System.out.println("Enter y coordinate");
		setyChoice(sc.nextInt());
		sc.close();
		
	}
	
	// Set boat location
	public void boatPlacement() {
		String boatChoice;
		String[] boatOptions;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter boat placement");
		System.out.print(">");
		boatChoice = sc.next().toUpperCase();
		boatOptions = boatChoice.split(",");
		
		Boat patrol1 = new Boat(BoatType.PATROLBOAT, boatOptions[0].charAt(0), Integer.parseInt(boatOptions[1]), Integer.parseInt(boatOptions[2]));
		System.out.println(patrol1.getCoord().getX());
		sc.close();
	}
	

	public int getxChoice() {
		return xChoice;
	}

	public void setxChoice(int xChoice) {
		this.xChoice = xChoice;
	}

	public int getyChoice() {
		return yChoice;
	}

	public void setyChoice(int yChoice) {
		this.yChoice = yChoice;
	}

}
