package chapter1;
//양의 정수값 자릿수 구하여 출력
import java.util.Scanner;

public class ex10 {
	public static void main(String[] args) {
		int num;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		while(true) {
			num = sc.nextInt();
			if(num > 0) break;
			System.out.println("양수를 입력해주세요");
		}
		int count = 1;
		while(num >= 10) {
			num /= 10;
			count++;
		}
		System.out.println("그 수는 "+count+"자리입니다.");
		
	}
}
