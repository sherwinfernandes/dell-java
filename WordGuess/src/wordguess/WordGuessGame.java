package wordguess;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Random;
import java.util.Scanner;

public class WordGuessGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String randomWord= getRandomWord();
		System.out.println(randomWord);
		
		char [] guess= new char[randomWord.length()];
		setGuess(guess,randomWord.length());
		
		int maxbadguesses=12;
		int badguesses=0;
		boolean solved =false;
		Scanner inp = new Scanner(System.in);
		while (badguesses< maxbadguesses && ! solved) {
			drawimg(badguesses);
			System.out.println(guess);
			System.out.println("Guess a letter");
			String guesschar=inp.nextLine();
			if (!validchar(guesschar)) {
				System.out.println("This is not a valid lowercase character");
				break;
			}
			if (!checkLetter(guesschar.charAt(0), randomWord, guess))
					badguesses++;
			solved=checkforsolved(guess);
		}
		if (solved) System.out.println("You win");
		else System.out.println("you lose");
		
		
	}
	
	
	

	private static boolean checkforsolved(char[] guess) {
		// TODO Auto-generated method stub
		String check= new String(guess);
		if (check.contains("-")) return false;
		return true;
	}




	private static boolean validchar(String guesschar) {
		// TODO Auto-generated method stub
		if (guesschar.length()>1) return false;
		return true;
	}




	private static boolean checkLetter(char guesschar, String word, char[] guess) {
		// TODO Auto-generated method stub
		boolean ret=false;
		for (int i=0; i<word.length();i++) {
			if (word.charAt(i)==guesschar) {
				guess[i]=guesschar;
				ret=true;
			}
		}
		return ret;
	}


	private static void setGuess(char[] guess, int length) {
		// TODO Auto-generated method stub
		for (int i=0;i<length;i++) {
			guess[i]='-';
		}
	}


	private static void drawimg(int count) {
		
	}

	private static String getRandomWord() {
		// open the file and get the number of words
		int num_lines = 0;
		try (BufferedReader br = new BufferedReader(new FileReader("C:/temp/words_alpha.txt"))) {
			String line;
			while ((line = br.readLine()) != null) {
				// process the line.
				num_lines++;
			}
		} catch (Exception e) {
			System.err.println(e);
		}
		System.out.println(num_lines);
		// generate a random number to randomly pick one of the words

		Random randNumGenerator = new Random();
		int randNum = randNumGenerator.nextInt(num_lines);

		// pick out the random word from the file
		num_lines = 0;
		String randomWord="";
		try (BufferedReader br = new BufferedReader(new FileReader("C:/temp/words_alpha.txt"))) {
			for (int i = 0; i < randNum; i++) {
				randomWord = br.readLine();
			}
		} catch (Exception e) {
			System.err.println(e);
		}
		
		return randomWord;
	}

}
