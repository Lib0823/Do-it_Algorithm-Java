package chapter1;

import java.util.Scanner;

public class Ex01 {
	
	static int max4(int a, int b, int c, int d) {
		int max = a; 
		if(max < b) max = b;
		if(max < c) max = c;
		if(max < d) max = d;
		
		return max;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 4개 입력 : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		int max = max4(a,b,c,d);
		
		System.out.println("max : " + max);
	}
}
