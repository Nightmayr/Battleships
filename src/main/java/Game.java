import java.util.Scanner;

public class Game {
	
	private int xChoice;
	private int yChoice;
	
	public String userStrike() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter x coordinate");
		setxChoice(sc.nextInt());
		System.out.println("Enter y coordinate");
		setyChoice(sc.nextInt());
		
		
		
		return null;
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
