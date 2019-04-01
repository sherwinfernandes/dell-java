package pigLatin;

import java.util.Scanner;




public class PigLatin {
	
	private static char [] vowels= {'a','e','i','o','u'};
	
	public static String PigLatin(String english) {
		int firstVowel= findPosition(english);
		if (firstVowel== -1) return english.concat("ay");
		if (firstVowel == 0) return english.concat("yay");
		return (english.substring(firstVowel)+english.substring(0,firstVowel)+"ay");
	}
	
	private static int findPosition(String english) {
		for (int i=0; i<english.length();i++) {
			for (int j=0; j<vowels.length; j++) {
				if (english.charAt(i)==vowels[j]) return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter a word");
		String englishWord=inp.nextLine();
		System.out.println("Translated to PigLatin is "+PigLatin(englishWord));
		inp.close();

	}

}
