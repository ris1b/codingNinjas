package tictactoe;

import java.util.Scanner;
//import java.util.*;
public class TicTacToe	{
	private Player player1, player2;
	private Board board;
	private int numPlayers;
	
	public static void main(String arg[]) {
		//First, create an object of the game:
		TicTacToe t = new TicTacToe();
		t.startGame();
//		ArrayList<Integer> arr = new ArrayList<Integer>();
//		arr.set(0, null);
	}

	//Creating a method, which will play the game for us
	public void startGame() {
		try (Scanner s = new Scanner(System.in)) {
			// Take Player inputs
			player1 = takePlayerInput(++numPlayers);	
			player2 = takePlayerInput(++numPlayers);
			//check if both symbols are unique:
			while(player1.getSymbol() == player2.getSymbol()) {
				System.out.println("Symbol already taken! Please enter the sybmol again.");
				player2.setSymbol(s.next().charAt(0));
			}
			
			// Create the board
			board = new Board(player1.getSymbol(), player2.getSymbol());
			
			
			// Play the game
			/*Playing or conducting means, asking both the players to repetitively
			 * make the moves, Till one of them Wins or Draw*/
				//Here, will ask both the players to repeatedly make the moves till either of
				//them wins. Or we reached Draw ==>
			boolean player1Turn = true;
			int status = Board.INCOMPLETE;
			while(status == Board.INCOMPLETE || status == Board.INVALIDMOVE) {
				if(player1Turn) {
					System.out.println("Player 1 -"  + player1.getName() + "'s turn");
					System.out.println("Enter X Cell: ");
					int x = s.nextInt();
					System.out.println("Enter Y Cel : ");
					int y = s.nextInt();
					
					status = board.move(player1.getSymbol(), x,y); //here we get the status of the board
					if(status == Board.INVALIDMOVE) {
						//When status is INVALID
						System.out.println("Invalid Move ! Please Try Again.");
						continue;		//Here, we dont want to Toggle the turn,So continue--> so that
										//it does not reach the end of the say loop.
					}
					/*else {
						//i.e after a valid move--> Now Player2's turn
						player1Turn = false;							//indicating Player2 turn
						board.print();
					}
					Commenting else statement & delted 
					*/
					
				}else {
					System.out.println("Player 2 -"  + player2.getName() + "'s turn");
					System.out.println("Enter X Cell: ");
					int x = s.nextInt();
					System.out.println("Enter Y Cel : ");
					int y = s.nextInt();
					
					status = board.move(player2.getSymbol(), x,y); //here we get the status of the board
					if(status == Board.INVALIDMOVE) {
						//When status is INVALID
						System.out.println("Invalid Move ! Please Try Again.");
						continue;
					}
					/*Instead of this, we can write the above two statements
					 player1Turn = !player1Turn; -->player1 turn is NOT of player1 turn
					 
						board.print();
					 else {
					 
						//i.e after a valid move--> Now Player1's turn
						player1Turn = true;							//indicating Player1 turn
					}
					*/
				}
				player1Turn = !player1Turn;		//NOT
				board.print(); 
			}
			if(status == Board.PLAYER1WINS) {
				System.out.println("Player 1 -  " + player1.getName() + " WINS !!");
			} else if(status == Board.PLAYER2WINS) {
				System.out.println("Player 2 -  " + player2.getName() + " WINS !!");
			} else {
				System.out.println("Draw !!");
			}
		}
	}
	private Player takePlayerInput(int num) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter player " + num + "name: ");
			String name = sc.nextLine();
			System.out.println("Enter Player " + num + "symbol: ");
			char symbol = sc.next().charAt(0);
			Player p = new Player(name, symbol);
			return p;
		}
	}
}





