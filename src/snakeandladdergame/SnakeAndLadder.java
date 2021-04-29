package snakeandladdergame;

public class SnakeAndLadder {
	//Constants
	public static final int isPlayer1=0;
	public static final int isLadder=1;
	public static final int isSnake=2;
	
	public static void main(String[] args) {
		// Variables
	    int posOfPlayer1=0;
		// Computations
		int Dice =(int) Math.round(Math.floor(Math.random()*10)%6+1);
		int optionCheck=(int) Math.round(Math.floor(Math.random()*10)%3);
		switch (optionCheck) {
			case isLadder:
				posOfPlayer1 += Dice;
				break;
			case isSnake:
				posOfPlayer1 -= Dice;
				if (posOfPlayer1 < 0)
					posOfPlayer1=0;
				break;
			default:
				break;
		}
		System.out.println("Player1 position : "+ posOfPlayer1);
		System.out.println("Number Shown on the dice = "+ Dice);
		
	}
}
