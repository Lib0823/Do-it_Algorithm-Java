package chapter1;

import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		
		System.out.println("a�� : ");
		a = sc.nextInt();
		
		while(true) {
			System.out.println("b�� : ");
			b = sc.nextInt();
			if(a < b) break;
			System.out.println("a���� ū ���� �Է��ϼ���!");
		}
		
		System.out.println("b-a�� "+(b-a)+"�Դϴ�.");
	}
}
