import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world!");
		System.out.println("Please type in something");
		Scanner reader = new Scanner(System.in);
		String input = reader.nextLine();
		System.out.println("You typed: " + input);
		reader.close();
	}

}
