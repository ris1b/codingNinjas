package hyperskill;
import java.util.*;

public class TicTacToe {
	
    
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// write your code here
		String ticTacToe = sc.nextLine();
		int i=0;
		while(i<9){
			System.out.print("-");
			i++;
		}
		System.out.println();
		System.out.print("| ");
		for(i=0;i<9;i++){
			if(i%3 == 0 && i!=0){
				System.out.println("|");
				System.out.print("| ");
			}
			System.out.print(ticTacToe.charAt(i)+ " ");
		}
		System.out.println("|");
		i=0;
		while(i<9){
			System.out.print("-");
			i++;
		}

		sc.close();
	}

}

