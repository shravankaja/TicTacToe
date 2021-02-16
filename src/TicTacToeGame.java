import java.util.*;

public class TicTacToeGame { // class

	public static char comp_Input; // all static variablles
	public static char input_User1;
	static char[] empty_Board = new char[10];
	public static float turn;
	public static boolean check;
	public static int input_count;
	static int rand_Input_Comp;
	static int chance;
	static int compChoiceToBeTaken;
	static char check_condition;
	public static int input_Position_Comp;
	static int end_game = 0;
	static int[] positionArray = new int[20];

	public static char[] uc1_Initialize() { // intialize board using an array

		for (int i = 0; i < 10; i++) {
			empty_Board[i] = ' ';
		}
		return empty_Board;

	}

	public static char uc2_Select_Char() { // method to assign user and comp with X or O
		System.out.println("Select X or O");
		Scanner input = new Scanner(System.in);
		char input_User = input.next().charAt(0);
		char input_Final;
		if (input_User == 'X') {
			input_User = 'X';
			comp_Input = 'O';
			check_condition = 'x';

		} else if (input_User == 'O') {
			input_User = 'O';
			comp_Input = 'X';
			check_condition = 'o';

		}
		return input_User;
	}

	public static void uc3_Display_Board() { // displays board using array

		System.out.println("|---|---|---|");
		System.out.println("| " + empty_Board[1] + " | " + empty_Board[2] + " | " + empty_Board[3] + " |");
		System.out.println("|-----------|");
		System.out.println("| " + empty_Board[4] + " | " + empty_Board[5] + " | " + empty_Board[6] + " |");
		System.out.println("|-----------|");
		System.out.println("| " + empty_Board[7] + " | " + empty_Board[8] + " | " + empty_Board[9] + " |");
		System.out.println("|---|---|---|");

	}

	public static void uc6_First_Chance() { // toss for deciding who plays first
		turn = Math.round(Math.random());
		if (turn == 0.0) {
			System.out.println("User wins first Chance");
			check = true;
		} else {
			System.out.println("Comp wins turn");
			check = false;
		}

	}

	public static void uc4_Take_Input() { // method to check condition and accept user input
		while (true) {
			if (input_count == 9) {
				System.out.println("No more turn left");
				end_game = 1;
				break;
			}
			System.out.println("Enter the cell you want to enter");
			Scanner input = new Scanner(System.in);
			int input_Position = input.nextInt();
			if (input_Position > 0 && input_Position < 10) {

				if (empty_Board[input_Position] == ' ') {
					empty_Board[input_Position] = input_User1;
					positionArray[input_Position] = input_Position;
					input_Position_Comp = input_Position;
					input_count++;
					break;
				} else {
					System.out.println("Position filled");
					continue;
				}

			} else {
				System.out.println("please enter valid cell range");
				continue;
			}
		}
	}

	public static void uc7_Win_Tie_Change() { // checking line and diagonal filled with X or O by user or comp

		for (int i = 1; i < 10; i = i + 3) { // horiontal lines
			if (empty_Board[i] == 'X' && empty_Board[i + 1] == 'X' && empty_Board[i + 2] == 'X'
					&& check_condition == 'x'
					|| empty_Board[i] == 'O' && empty_Board[i + 1] == 'O' && empty_Board[i + 2] == 'O'
							&& check_condition == 'o') {
				System.out.println("user wins ");
				end_game = 1;
				break;
			} else if (empty_Board[i] == 'X' && empty_Board[i + 1] == 'X' && empty_Board[i + 2] == 'X'
					|| empty_Board[i] == 'O' && empty_Board[i + 1] == 'O' && empty_Board[i + 2] == 'O') {
				System.out.println("Comp Wins ");
				end_game = 1;
				break;
			}

		}
		for (int i = 1; i < 4; i++) {
			if (empty_Board[i] == 'X' && empty_Board[i + 3] == 'X' && empty_Board[i + 6] == 'X'
					&& check_condition == 'x'
					|| empty_Board[i] == 'O' && empty_Board[i + 3] == 'O' && empty_Board[i + 6] == 'O'
							&& check_condition == 'o') {
				System.out.println("user wins ");

				end_game = 1;
				break;
			} else if (empty_Board[i] == 'X' && empty_Board[i + 3] == 'X' && empty_Board[i + 6] == 'X'
					|| empty_Board[i] == 'O' && empty_Board[i + 3] == 'O' && empty_Board[i + 6] == 'O') {
				System.out.println("comp wins");
				end_game = 1;
				break;
			}

		}

	}

	public static void comp_Input() { // incorporating behavior and accepting input from comp
		while (true) {
			if (input_count == 9) { // to exit game if turn condition has been meet
				System.out.println("No more turn left");
				end_game = 1;
				break;
			}

			if (compChoiceToBeTaken != 0) { // to ensure comp makes a intelligent move
				if (empty_Board[compChoiceToBeTaken] == ' ') {
					empty_Board[compChoiceToBeTaken] = comp_Input;
					positionArray[compChoiceToBeTaken] = compChoiceToBeTaken;
					input_count++;
					break;
				}
			}

			Random rn = new Random();
			rand_Input_Comp = rn.nextInt(10);

			if (empty_Board[rand_Input_Comp] == ' ') {
				empty_Board[rand_Input_Comp] = comp_Input;
				positionArray[rand_Input_Comp] = rand_Input_Comp;
				input_count++;
				break;
			} else {
				System.out.println("");
				continue;
			}
		}

	}

	public static void blockUserWinChances() { // checking for line patterns
		for (int i = 1; i < 10; i = i + 3) { // horiontal lines
			if (positionArray[i] == i && positionArray[i + 1] == i + 1) {
				compChoiceToBeTaken = i + 2;
			} else if (positionArray[i + 2] == i + 2 && positionArray[i + 1] == i + 1) {
				compChoiceToBeTaken = i;
			} else if (positionArray[i] == i && positionArray[i + 2] == i + 2) {
				compChoiceToBeTaken = i + 1;
			}

		}
		for (int i = 1; i < 4; i++) {// ertical lines
			if (positionArray[i] == i && positionArray[i + 3] == i + 3) {
				compChoiceToBeTaken = i + 6;
			} else if (positionArray[i + 3] == i + 3 && positionArray[i + 6] == i + 6) {
				compChoiceToBeTaken = i;
			}

			else if (positionArray[i] == i && positionArray[i + 6] == i + 6) {
				compChoiceToBeTaken = i + 3;
			}

		}
	}

	public static void firstChanceDecider() {
		if (check == true) {
			uc4_Take_Input(); // first chance

			chance = 0;
			uc3_Display_Board();

			System.out.println("----------------------------------------------------------------");
		} else if (check == false) {

			comp_Input();

			chance = 1;

			uc3_Display_Board();

			System.out.println("----------------------------------------------------------------");
		}
		while (end_game == 0) { // to give alternate chances to user and comp
			if (chance == 0) {
				blockUserWinChances();
				comp_Input();
				uc3_Display_Board();
				chance = 1;
				uc7_Win_Tie_Change();
				System.out.println("----------------------------------------------------------------");
				continue;
			} else if (chance == 1) {
				uc4_Take_Input();
				uc3_Display_Board();
				chance = 0;
				uc7_Win_Tie_Change();
				uc3_Display_Board();
				System.out.println("----------------------------------------------------------------");
				continue;
			}

		}

	}

	public static void main(String Args[]) {
		int play_Another_Game = 0;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Welcome to Tic Tac Toe");
			uc1_Initialize();
			input_User1 = uc2_Select_Char();
			System.out.println("User Selected input :" + input_User1);
			System.out.println("Comp selected input :" + comp_Input);
			uc3_Display_Board();
			uc6_First_Chance();
			firstChanceDecider();
			System.out.println("Enter 1 if you want to play another game");

			play_Another_Game = sc.nextInt();
		} while (play_Another_Game == 1);

	}
}