package chapter1;

public class Ex03 {

	static int min4(int a, int b, int c, int d) {
		int min = a;
		
		if(min > b) min = b;
		if(min > c) min = c;
		if(min > d) min = d;
		
		return min;
	}
	
	public static void main(String[] args) {
		int min = min4(4, 1, 9, 7);
		System.out.println("min : " + min);
	}
}
