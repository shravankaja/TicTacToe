import java.util.*;

public class TicTacToeGame {
	
	public static char comp_Input;

	public static char[] uc1_Initialize() {
		char[] empty_Board = new char[10];
		for (int i = 0; i < 10; i++) {
			empty_Board[i] = ' ';
		}
		return empty_Board;

	}

	public static char uc2_Select_Char() {
		System.out.println("Select X or O");
		Scanner input = new Scanner(System.in);
		char input_User = input.next().charAt(0);
		char input_Final;
		if (input_User == 'X') {
			input_User = 'X';
			comp_Input = 'O';

		} else if (input_User == 'O') {
			input_User = 'O';
			comp_Input = 'x';
		}
		return input_User;
	}

	public static void main(String Args[]) {
		System.out.println("Welcome to Tic Tac Toe");
		uc1_Initialize();
		char input_User1 = uc2_Select_Char();
		System.out.println("User Selected input :" + input_User1);
		System.out.println("Comp selected input :" + comp_Input);
	}

}