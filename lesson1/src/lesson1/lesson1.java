package lesson1;

public class lesson1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=12;
		int b=14;
		int c= mult(a,b);
		System.out.println(fib(32));
	}
	
	public static int mult(int _a, int _b) {
		return _a+_b;
	}
	public static int fib(int index) {
		if (index==0||index==1) return 1;
		else return fib(index-1)+fib(index-2);
	}

}
