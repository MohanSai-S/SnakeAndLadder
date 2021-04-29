package snakeandladdergame;

public class SnakeAndLadder {
	//Constants
	public static final int player1 = 0; 
	
	public static void main(String[] args) {
		
		int posOfPlayer1=0;
		int Dice =(int) Math.round(Math.floor(Math.random()*10)%6+1);
		System.out.println("Number Shown on the dice = "+ Dice);
	}
}
