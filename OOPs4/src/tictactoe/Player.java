package tictactoe;

public class Player {
	private String name;
	private char symbol;
	
	public Player() {
		//Default constructor
	}
	
	public Player(String name, char symbol) {
		setName(name);
		setSymbol(symbol);
	}

	public void setName(String name) {
		if(!name.isEmpty() || name!= " ") {
			this.name = name;
		}
	}
	public String getName() {
		return this.name;
	}

	public void setSymbol(char symbol) {
		if(symbol != '\0' ) {
			this.symbol = symbol;
		}
	}
	public char getSymbol() {
		return this.symbol;
	}
}



