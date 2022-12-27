package chapter1;

public class Ex02 {

	static int min3(int a, int b, int c) {
		int min = a;
		
		if(min > b) min = b;
		if(min > c) min = c;
		
		return min;
	}
	
	public static void main(String[] args) {
		int min = min3(5, 8, 2);
		System.out.println("min : " + min);
	}
}
