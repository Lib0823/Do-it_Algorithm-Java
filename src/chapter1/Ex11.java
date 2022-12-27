package chapter1;
// 구구단 표 출력
public class Ex11 {
	public static void main(String[] args) {
		
		System.out.print("   |");
		for(int i=1;i<=9;i++) {
			System.out.printf("%3d", i);
		}
		for(int i=1;i<=9;i++) {
			System.out.printf("%2d", i);
			System.out.print("|");
		}
		
	}
}
