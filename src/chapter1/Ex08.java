package chapter1;

import java.util.Scanner;

public class Ex08 {

	static int sumof(int a, int b) {
		int sum = 0;
		int max, min;
		
		if(a <= b) {
			max = b; min = a;
		}
		else {
			max = a; min = b;
		}
		for(int i = min; i<=max; i++) {
			sum += i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�ΰ��� �� �Է� : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("�ΰ��� �� ������ ��� ���� �� : "+sumof(a,b));
	}
}
