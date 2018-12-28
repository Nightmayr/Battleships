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
		
	}
	
	// Set boat location
	public void boatPlacement(Boat boat) {
		String boatChoice;
		String[] boatCoords;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter boat placement");
		System.out.print(">");
		boatChoice = sc.next().toUpperCase();
		boatCoords = boatChoice.split(",");
		
//		for(int i=0; i<boatCoords.length; i++) {
//			System.out.println(boatCoords[i]);
//		}
		
		if(boatCoords[0]=="V") {
			for(int i = 0; i<boat.getSize();i++) {
				String[][] boatSetCoords = new String[3][3];
				boatSetCoords[boat.getxPos()][boat.getyPos()-i] = "p";
				board.setBoard(boatSetCoords);
			}
		}

		
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
