package chapter1;
//���� ������ �ڸ��� ���Ͽ� ���
import java.util.Scanner;

public class ex10 {
	public static void main(String[] args) {
		int num;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է� : ");
		while(true) {
			num = sc.nextInt();
			if(num > 0) break;
			System.out.println("����� �Է����ּ���");
		}
		int count = 1;
		while(num >= 10) {
			num /= 10;
			count++;
		}
		System.out.println("�� ���� "+count+"�ڸ��Դϴ�.");
		
	}
}
