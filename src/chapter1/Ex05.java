// ����1-5
// �� �������� �߾Ӱ��� ���Ͽ� ���(�ٸ� Ǯ��)

/*
  ó�� if ���� �Ǵ�
����  if ((b >= a && c<= a) || (b <= a && c >= a)
 �� �ָ��մϴ�. 
  ���⼭ b >= a �� b <= a�� �Ǵ��� ������ �Ǵ�
  (���������� ������ �Ǵ�)��, ����Ͽ�  else ���Ŀ���
���� else if ((a > b && c < b) || (b <= a && c > b)
  �� ����˴ϴ�. ��, ó�� if�� �������� �ʴ� ���,
  2��° if������ (���������� ) ���� �Ǵ��� �����ϹǷ�,
  ȿ���� �������ϴ�.
*/
package chapter1;
class Med3x {

	//--- a, b, c�� �߾Ӱ��� ���Ͽ� ��ȯ(�ٸ� Ǯ��) ---//
	static int med3(int a, int b, int c) {
		if ((b >= a && c <= a) || (b <= a && c >= a))
			return a;
		else if ((a > b && c < b) || (a < b && c > b))
			return b;
		return c;
	}

	public static void main(String[] args) {
		System.out.println("med3(3,2,1) = " + med3(3,2,1));      // a��b��c
		System.out.println("med3(3,2,2) = " + med3(3,2,2));      // a��b��c
		System.out.println("med3(3,1,2) = " + med3(3,1,2));      // a��c��b
		System.out.println("med3(3,2,3) = " + med3(3,2,3));      // a��c��b
		System.out.println("med3(2,1,3) = " + med3(2,1,3));      // c��a��b
		System.out.println("med3(3,3,2) = " + med3(3,3,2));      // a��b��c
		System.out.println("med3(3,3,3) = " + med3(3,3,3));      // a��b��c
		System.out.println("med3(2,2,3) = " + med3(2,2,3));      // c��a��b
		System.out.println("med3(2,3,1) = " + med3(2,3,1));      // b��a��c
		System.out.println("med3(2,3,2) = " + med3(2,3,2));      // b��a��c
		System.out.println("med3(1,3,2) = " + med3(1,3,2));      // b��c��a
		System.out.println("med3(2,3,3) = " + med3(2,3,3));      // b��c��a
		System.out.println("med3(1,2,3) = " + med3(1,2,3));      // c��b��a
	}
}