import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {

	private static String[] hands=  {"rock", "paper", "scissors"};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp;
		
		inp=new Scanner(System.in);
		System.out.println("Enter your hand");
		String player= inp.nextLine();
		String machine= hands[new Random().nextInt(3)];
		System.out.println("Machine picks "+machine+", and you picked "+ player);
		String winner=findWinner(player, machine);
		System.out.println(winner+" has prevailed");
		inp.close();
		
	}
	
	private static String findWinner(String p1, String p2) {
		int p1i=indexof(p1);
		int p2i=indexof(p2);
		if (p1i==-1 || p2i== -1) return "bad input";
		if (p1i==p2i) return "Nobody";
		if (p1i== (p2i+1)%3) return "Player";
		return "System";
	}

	private static int indexof(String which) {
		if (which.equals(hands[0])) return 0;
		if (which.equals(hands[1])) return 1;
		if (which.equals(hands[2])) return 2;
		return -1;
	}
}
