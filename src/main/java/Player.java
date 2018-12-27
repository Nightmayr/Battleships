import java.util.Scanner;

public class Player {

	
	private int xChoice;
	private int yChoice;
	
	public void playerStrike() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x coordinate");
		setxChoice(sc.nextInt());
		System.out.println("Enter y coordinate");
		setyChoice(sc.nextInt());
		
	}
	
	public void boatPlacement() {
		Scanner sc = new Scanner(System.in);
		
		
		setyChoice(sc.nextInt());
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
