package snakeandladdergame;

public class SnakeAndLadder {
	//Constants
	public static final int isPlayer1=0;
	public static final int isPlayer2=1;
	public static final int isLadder=1;
	public static final int isSnake=2;
	
	public static void main(String[] args) {
		// Variables
		int player=0;
	    int posOfPlayer1=0;
	    int posOfPlayer2=0;
	    int noOfRollsByDice=0;
	    // Computations
	    while( posOfPlayer1<100 && posOfPlayer2<100) {
	    	noOfRollsByDice++;
			int dice =(int) Math.floor(Math.random()*10)%6+1;
			int optionCheck=(int) Math.floor(Math.random()*10)%3;
			switch (optionCheck) {
				case isLadder:
					System.out.println("You got Ladder");
					if (player == isPlayer2) {
						posOfPlayer2 += dice;
					}else {
						posOfPlayer1 += dice;
					}
					break;
				case isSnake:
					System.out.println("Snake bites");
					if (player == isPlayer1) {
						posOfPlayer1 -= dice;
						if (posOfPlayer1 < 0)
							posOfPlayer1=0;
					}else {
						posOfPlayer2 -= dice;
						if (posOfPlayer2 < 0)
							posOfPlayer2=0;
					}
					break;
				default:
					System.out.println("No Play");
					break;
			}
			if (posOfPlayer1>100 || posOfPlayer2>100) {
				System.out.println("No Play");
				if(player== isPlayer1) {
					posOfPlayer1 -= dice;
				}else {
					posOfPlayer2 -= dice;
				}
			}
			System.out.println("Number Shown on the dice = "+ dice);
			System.out.println("Player1 position : "+ posOfPlayer1);
			System.out.println("Player2 position : "+ posOfPlayer2);
			if(optionCheck==1) {
				System.out.println("Congrats! One more Chance.");
			}else if (player == isPlayer1) {
				System.out.println("Second Player turn");
				player=1;
			}else {
				System.out.println("First Player Turn");
				player=0;
			}
	    }
	    System.out.println("Rolls taken by Dice in Winning Journey : "+ noOfRollsByDice);
	    if (posOfPlayer1==100) {
	    	System.out.println("Player1 Wins");
	    }
	    else {
	    	System.out.println("Player2 Wins");
	    }
	}
}
