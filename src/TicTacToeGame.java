
public class TicTacToeGame {
	public static char p_00;
	public static char p_01;
	public static char p_02;
	public static char p_10;
	public static char p_11;
	public static char p_12;
	public static char p_20;
	public static char p_21;
	public static char p_22;

	public static void uc1_Initialize() {
		char[] empty_Board = new char[10];
		for (int i = 1; i <= 10; i++) {
			empty_Board[i] = ' ';
		}
	}

	public static void main(String Args[]) {
		System.out.println("Welcome to Tic Tac Toe");
		uc1_Initialize();
	}

}