
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
		char[] empty_Board=new char[10];
		
		 empty_Board[1]=p_00;
		 empty_Board[2]=p_01;
		 empty_Board[3]=p_02;
		 empty_Board[4]=p_10;
		 empty_Board[5]=p_11;
		 empty_Board[6]=p_12;
		 empty_Board[7]=p_20;
		 empty_Board[8]=p_21;
		 empty_Board[9]=p_22;
	}
	public static void main(String Args[])
	{
		System.out.println("Welcome to Tic Tac Toe");
		uc1_Initialize();
	}

}
