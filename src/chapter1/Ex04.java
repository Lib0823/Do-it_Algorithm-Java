package chapter1;

import java.util.Scanner;

//3개의 값을 입력받아 중앙값 구하기
public class Ex04 {

	static int med3(int a, int b, int c) {
		if(a >= b) {
			if(c >= a) return a;
			else if(b >= c) return b;
			else return c;
		}
		else if(c < a) return a;
		else if(c < b) return c;
		else return b;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 3개 입력 : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int med = med3(a, b, c);
		System.out.println("med : "+ med);
	}
}
