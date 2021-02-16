import java.util.*;

public class TicTacToeGame {

	public static char comp_Input;
	public static char input_User1;
	static char[] empty_Board = new char[10];
	public static float turn;
	public static boolean check;
	public static int input_count;
	static int rand_Input_Comp;
	static int chance;
	public static int input_Position_Comp;

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

	public static void uc6_First_Chance() {
		turn = Math.round(Math.random());
		if (turn == 0.0) {
			System.out.println("User wins first Chance");
			check = true;
		} else {
			System.out.println("Comp wins turn");
			check = false;
		}

	}

	public static void uc4_Take_Input() {
		while (true) {
			if (input_count == 9) {
				System.out.println("No more turn left");
				System.exit(0);
				break;
			}
			System.out.println("Enter the cell you want to enter");
			Scanner input = new Scanner(System.in);
			int input_Position = input.nextInt();
			if (input_Position > 0 && input_Position < 10) {

				if (empty_Board[input_Position] == ' ') {
					empty_Board[input_Position] = input_User1;
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

	public static void uc7_Win_Tie_Change() {
		if (empty_Board[1] == 'X' && empty_Board[2] == 'X' && empty_Board[3] == 'X' && check == true
				|| empty_Board[1] == 'O' && empty_Board[2] == 'O' && empty_Board[3] == 'O' && check == true) {
			System.out.println("User wins \n");
			System.exit(0);
		} else if (empty_Board[1] == 'X' && empty_Board[2] == 'X' && empty_Board[3] == 'X' && check == false
				|| empty_Board[1] == 'O' && empty_Board[2] == 'O' && empty_Board[3] == 'O' && check == false) {
			System.out.println("Comp wins \n");
			System.exit(0);
		} else if (empty_Board[4] == 'X' && empty_Board[5] == 'X' && empty_Board[6] == 'X' && check == false
				|| empty_Board[4] == 'O' && empty_Board[5] == 'O' && empty_Board[6] == 'O' && check == false) {
			System.out.println("Comp Wins");
			System.exit(0);
		} else if (empty_Board[7] == 'X' && empty_Board[8] == 'X' && empty_Board[9] == 'X' && check == false
				|| empty_Board[7] == 'O' && empty_Board[8] == 'O' && empty_Board[9] == 'O' && check == false) {
			System.out.println("Comp Wins");
			System.exit(0);
		} else if (empty_Board[4] == 'X' && empty_Board[5] == 'X' && empty_Board[6] == 'X' && check == true
				|| empty_Board[4] == 'O' && empty_Board[5] == 'O' && empty_Board[6] == 'O' && check == true) {
			System.out.println("User wins \n");
			System.exit(0);
			System.exit(0);
		} else if (empty_Board[7] == 'X' && empty_Board[8] == 'X' && empty_Board[9] == 'X' && check == true
				|| empty_Board[7] == 'O' && empty_Board[8] == 'O' && empty_Board[9] == 'O' && check == true) {
			System.out.println("User wins \n");
			System.exit(0);
		} else if (empty_Board[1] == 'X' && empty_Board[4] == 'X' && empty_Board[7] == 'X' && check == true
				|| empty_Board[1] == 'O' && empty_Board[4] == 'O' && empty_Board[7] == 'O' && check == true) {
			System.out.println("User wins \n");
			System.exit(0);
		} else if (empty_Board[2] == 'X' && empty_Board[5] == 'X' && empty_Board[8] == 'X' && check == true
				|| empty_Board[2] == 'O' && empty_Board[5] == 'O' && empty_Board[8] == 'O' && check == true) {
			System.out.println("User wins \n");
			System.exit(0);
		} else if (empty_Board[3] == 'X' && empty_Board[6] == 'X' && empty_Board[9] == 'X' && check == true
				|| empty_Board[3] == 'O' && empty_Board[6] == 'O' && empty_Board[9] == 'O' && check == true) {
			System.out.println("User wins \n");
			System.exit(0);
		} else if (empty_Board[1] == 'X' && empty_Board[4] == 'X' && empty_Board[7] == 'X' && check == false
				|| empty_Board[1] == 'O' && empty_Board[4] == 'O' && empty_Board[7] == 'O' && check == false) {
			System.out.println("Comp wins \n");
			System.exit(0);
		} else if (empty_Board[2] == 'X' && empty_Board[5] == 'X' && empty_Board[8] == 'X' && check == false
				|| empty_Board[2] == 'O' && empty_Board[5] == 'O' && empty_Board[8] == 'O' && check == false) {
			System.out.println("Comp wins \n");
			System.exit(0);
		} else if (empty_Board[3] == 'X' && empty_Board[6] == 'X' && empty_Board[9] == 'X' && check == false
				|| empty_Board[3] == 'O' && empty_Board[6] == 'O' && empty_Board[9] == 'O' && check == false) {
			System.out.println("Comp wins \n");
			System.exit(0);
		} else {
			System.out.println("No winner yet");
		}
	}

	public static void comp_Input() {
		while (true) {
			if (input_count == 9) {
				System.out.println("No more turn left");
				System.exit(0);
				break;
			}

			Random rn = new Random();
			rand_Input_Comp = rn.nextInt(10);
			int rand_Input_Comp1 = input_Position_Comp + 1;
			int rand_Input_Comp2 = input_Position_Comp - 1;

			if (rand_Input_Comp > 0 && rand_Input_Comp < 10) {

				/*
				 * if (empty_Board[rand_Input_Comp] == ' '|| empty_Board[rand_Input_Comp1]==' '
				 * || empty_Board[rand_Input_Comp1]==' ' ) { empty_Board[rand_Input_Comp] =
				 * comp_Input; input_count++; break;
				 */
				if (empty_Board[rand_Input_Comp1] == ' ') {
					empty_Board[rand_Input_Comp1] = comp_Input;
					input_count++;
					break;
				} else if (empty_Board[rand_Input_Comp2] == ' ') {
					empty_Board[rand_Input_Comp2] = comp_Input;
					input_count++;
					break;
				} else if (empty_Board[rand_Input_Comp] == ' ') {
					empty_Board[rand_Input_Comp] = comp_Input;
					input_count++;
					break;
				} else {
					System.out.println("");
					continue;
				}
			} else {
				System.out.println("");
				continue;
			}
		}

	}

	public static void main(String Args[]) {
		int play_Another_Game=0;
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to Tic Tac Toe");
		uc1_Initialize();
		input_User1 = uc2_Select_Char();
		System.out.println("User Selected input :" + input_User1);
		System.out.println("Comp selected input :" + comp_Input);
		uc3_Display_Board();
		uc6_First_Chance();
		if (check == true) {
			uc4_Take_Input();
			chance = 0;
			uc7_Win_Tie_Change();
			uc3_Display_Board();
			System.out.println("----------------------------------------------------------------");
		} else if (check == true) {
			comp_Input();
			chance = 1;
			uc7_Win_Tie_Change();
			uc3_Display_Board();
			System.out.println("----------------------------------------------------------------");
		}
		while (true) {
			if (chance == 0) {
				comp_Input();
				chance = 1;
				uc7_Win_Tie_Change();
				uc3_Display_Board();
				System.out.println("----------------------------------------------------------------");
				uc3_Display_Board();
				continue;
			} else if (chance == 1) {
				uc4_Take_Input();
				chance = 0;
				uc7_Win_Tie_Change();
				uc3_Display_Board();
				System.out.println("----------------------------------------------------------------");
				uc3_Display_Board();
				continue;
			}
			System.out.println("Enter 1 if you want to play another game");
			play_Another_Game=sc.nextInt();
		}
	
		

	}
}