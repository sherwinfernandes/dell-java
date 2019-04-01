package tictactoe;

import java.util.Scanner;

public class TicTacToe {
	
	private static Scanner inp = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char [][] board= {{' ',' ',' '},{' ',' ',' '},{' ',' ',' '}};
		char winner=' ';
		char turn= 'X';
		printBoard(board);
		while (winner==' ') {
			System.out.println("It is player "+turn+"'s turn");
			int playermove= getPlayermove();
			int row= playermove/3;
			int col= playermove%3;
			if (!valid(row,col, board)) continue;
			board[row][col]= turn;
			if (checkwinner(board,turn)) {
				winner= turn;
				System.out.println(winner +" wins.");
			}
			if (turn =='X') {turn ='O';}
			else {turn ='X';}
			printBoard(board);
			
			if (tie(board)) {
				System.out.println("Tie");
				break;
			}
			
		}
		inp.close();
	}
	
	private static boolean tie (char[][] b) {
		int emptycount = 0;
		for (int i=0;i<b.length;i++) {
			for (int j=0;j<b[i].length;j++) {
				if (b[i][j]==' ') emptycount++;
			}
		}
		return emptycount==0;
	}
	
	private static void printBoard(char[][] b) {
		for (int i=0;i<b.length;i++) {
			for (int j=0;j<b[i].length;j++) {
				System.out.print(b[i][j]);
				if (j<b[i].length-1) System.out.print("|");
			}
			System.out.println();
			if(i<b.length-1)System.out.println("- - -");
		}
		
	}
	private static int getPlayermove() {
		System.out.println("select a cell (0-8)");

		String rets= inp.nextLine().toString();
		int ret= Integer.parseInt(rets);

		return ret;
	}
	
	private static boolean valid(int r, int c, char[][] board) {
		if (r<0 || r>2 || c< 0 || c>2) return false;
		if (board[r][c] != ' ') return false;
		return true;
	}

	private static boolean checkwinner(char[][] b, char turn) {
		return (
				//row win
				(b[0][0]==turn && b[0][1]==turn && b[0][2]==turn)||
				(b[1][0]==turn && b[1][1]==turn && b[1][2]==turn) ||
				(b[2][0]==turn && b[2][1]==turn && b[2][2]==turn) ||
				//column win
				(b[0][0]==turn && b[1][0]==turn && b[2][0]==turn) ||
				(b[0][1]==turn && b[1][1]==turn && b[2][1]==turn)||
				(b[0][2]==turn && b[1][2]==turn && b[2][2]==turn)||
				//diagonal win
				(b[0][0]==turn && b[1][1]==turn && b[2][2]==turn)||
				(b[0][2]==turn && b[1][1]==turn && b[2][0]==turn));
	}
}
