package chapter1;

import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		
		System.out.println("a값 : ");
		a = sc.nextInt();
		
		while(true) {
			System.out.println("b값 : ");
			b = sc.nextInt();
			if(a < b) break;
			System.out.println("a보다 큰 값을 입력하세요!");
		}
		
		System.out.println("b-a는 "+(b-a)+"입니다.");
	}
}
