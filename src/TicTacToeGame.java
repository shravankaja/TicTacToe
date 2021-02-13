import java.util.*;

public class TicTacToeGame {

	public static char comp_Input;
	public static char input_User1;
	static char[] empty_Board = new char[10];

	public static char[] uc1_Initialize() {

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
			comp_Input = 'X';
		}
		return input_User;
	}

	public static void uc3_Display_Board() {

		System.out.println("|---|---|---|");
		System.out.println("| " + empty_Board[1] + " | " + empty_Board[2] + " | " + empty_Board[3] + " |");
		System.out.println("|-----------|");
		System.out.println("| " + empty_Board[4] + " | " + empty_Board[5] + " | " + empty_Board[6] + " |");
		System.out.println("|-----------|");
		System.out.println("| " + empty_Board[7] + " | " + empty_Board[8] + " | " + empty_Board[9] + " |");
		System.out.println("|---|---|---|");

	}

	public static void uc4_Take_Input() {
		System.out.println("Enter the cell you want to enter");
		Scanner input = new Scanner(System.in);
		int input_Position = input.nextInt();
		if (empty_Board[input_Position] == ' ') {
			empty_Board[input_Position] = input_User1;
		} else {
			System.out.println("Position filled");
		}
	}

	public static void main(String Args[]) {
		System.out.println("Welcome to Tic Tac Toe");
		uc1_Initialize();
		input_User1 = uc2_Select_Char();
		System.out.println("User Selected input :" + input_User1);
		System.out.println("Comp selected input :" + comp_Input);
		uc3_Display_Board();
		uc4_Take_Input();
		uc3_Display_Board();
		uc4_Take_Input();
		uc3_Display_Board();

	}
}