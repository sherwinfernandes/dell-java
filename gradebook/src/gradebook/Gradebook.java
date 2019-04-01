package gradebook;

import java.awt.List;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;
import java.util.concurrent.ThreadLocalRandom;

public class Gradebook {
	
	private static Scanner inp = new Scanner(System.in);
	private  Map <String, String> _gradelist= new HashMap<>(); // the grades as a string
	private  Map <String, ArrayList<Double>> _scores= new HashMap<>(); //the grades as doubles
	private  Map <String, Double > _average = new HashMap<>();
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gradebook gb= new Gradebook();
		
		gb.getInput();
		
		gb.calculateAverage();

		gb.print();
		
	}
	
	
	// capture the user input and populate the grades and scores.
	public void getInput() {
		System.out.println("How many students in the class?");
		int numStudents=Integer.parseInt(inp.nextLine());
		for (int i=0;i<numStudents; i++) {
			System.out.println("What is the student's name");
			String name= inp.nextLine();
			System.out.println("Enter a comma separated list of grades");
			String grades= inp.nextLine();
			_gradelist.put(name, grades);
			
			//populate the Maps
			String [] parts= grades.split(",");
			ArrayList<Double> nums= new ArrayList<Double>();
			for (int j=0; j<parts.length;j++) {
				nums.add(Double.parseDouble(parts[j]));
			}
			
			_scores.put(name, nums);
		}
	}
	
	// populate the average score of each student
	public void calculateAverage() {
		for(String s: _scores.keySet()) {
			Double cummulative = new Double(0);
			int count=0;
			for (Double a: _scores.get(s)) {
				cummulative += a;
				count++;
			}
			_average.put(s, cummulative/count);
		}
		
	}
	
	// Print the average of every student
	public void print() {
		for (String s: _average.keySet())
			System.out.println(s+ " has an average of "+ _average.get(s));
	}
	
	
/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map <String, Integer> grades= new HashMap<>();
		
		for (int a=97;a<107;a++)
				for (int b=97;b<107;b++)
					for (int c=97;c<107;c++) {
						char[] rd= {(char)a, (char)b, (char)c};
						String rand = new String(rd);
						Integer rint= ThreadLocalRandom.current().nextInt(0, 101);
						grades.put(rand, rint);
					}

		//Iterator <String> it= grades.iterator();	
		for (String key: grades.keySet())
			System.out.println(key +" "+ grades.get(key));
		
		
		
		Stack <Integers> stint = new 
		
	}

}

public class StackWithGetLargest extends Stack<Integer>{
	
	private Deque <Integer> _stack = new ArrayDeque<Integer>();
	private Map <Integer, Integer> _comp= new HashMap<>();
	
	public Integer push(Integer g) {
		_comp.put(g, _stack.push(g));
	}
	
	*/
	
}