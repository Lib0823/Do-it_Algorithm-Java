package chapter1;

//����1-6
//1, 2, ..., n�� ������ ���մϴ�.(while ���� ������ �� i�� ���� Ȯ��)

import java.util.Scanner;

class SumWhileEx {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("1���� n������ ������ ���մϴ�.");
		System.out.print("n�� �� : ");
		int n = stdIn.nextInt();

		int sum = 0;				// ����
		int i = 1;

		while (i <= n) {		// i�� n�����̸� �ݺ�
			sum += i;					// sum�� i�� ���մϴ�
			i++;							// i�� ���� 1 ����
		}
		System.out.println("1���� " + n + "������ ������ " + sum + "�Դϴ�.");
		System.out.println("i�� ���� " + i + "(��)�� �˴ϴ�.");
	}
}
