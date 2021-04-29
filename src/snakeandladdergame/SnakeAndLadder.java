package snakeandladdergame;

public class SnakeAndLadder {
	//Constants
	public static final int isPlayer1=0;
	public static final int isLadder=1;
	public static final int isSnake=2;
	
	public static void main(String[] args) {
		// Variables
	    int posOfPlayer1=0;
//	    int dice=0;
//	    int optionCheck=0;
	    // Computations
	    while( posOfPlayer1<100) {
			int dice =(int) Math.round(Math.floor(Math.random()*10)%6+1);
			int optionCheck=(int) Math.round(Math.floor(Math.random()*10)%3);
			switch (optionCheck) {
				case isLadder:
					System.out.println("You got Ladder");
					posOfPlayer1 += dice;
					break;
				case isSnake:
					System.out.println("Snake bites");
					posOfPlayer1 -= dice;
					if (posOfPlayer1 < 0)
						posOfPlayer1=0;
					break;
				default:
					System.out.println("No Chance to Play");
					break;
			}
			if (posOfPlayer1>100) {
				System.out.println("No Play");
				posOfPlayer1 -= dice;
			}
			System.out.println("Number Shown on the dice = "+ dice);
			System.out.println("Player1 position : "+ posOfPlayer1);
		}
	}
}
