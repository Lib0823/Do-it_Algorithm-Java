package chapter1;

import java.util.Scanner;

//3���� ���� �Է¹޾� �߾Ӱ� ���ϱ�
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
		System.out.println("���� 3�� �Է� : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int med = med3(a, b, c);
		System.out.println("med : "+ med);
	}
}
