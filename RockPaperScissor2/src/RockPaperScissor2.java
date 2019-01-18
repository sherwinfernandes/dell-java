import java.util.Scanner;
import java.text.ParseException;
import java.util.Random;

public class RockPaperScissor2 {

	private static String[] hands=  {"rock", "paper", "scissors"};
	
	private static Scanner inp = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean quit = false;
		while (!quit) {
			try{
				quit=playround();
			}catch(ParseException e) {
				System.out.println(e);
			}
			
		}

		
		
		inp.close();

	}
	
	private static boolean playround() throws ParseException {
		System.out.println("Enter your hand or done to finish");
		String player= inp.nextLine();
		if (player.equals("done")) return true;
		String machine= hands[new Random().nextInt(3)];
		System.out.println("Machine picks "+machine+", and you picked "+ player);
		String winner=findWinner(player, machine);
		System.out.println(winner+" has prevailed");
		return false;
		
	}

	private static String findWinner(String p1, String p2) throws ParseException {
		int p1i=indexof(p1);
		int p2i=indexof(p2);
		if (p1i==-1 || p2i== -1) return "bad input";
		if (p1i==p2i) return "Nobody";
		if (p1i== (p2i+1)%3) return "Player";
		return "System";
	}

	private static int indexof(String which) throws ParseException {
		if (which.equals(hands[0])) return 0;
		if (which.equals(hands[1])) return 1;
		if (which.equals(hands[2])) return 2;
		throw new ParseException("not one of the allowed hands",1);
	}
}