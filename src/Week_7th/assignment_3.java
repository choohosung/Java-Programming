package Week_7th;
import java.util.Scanner;
public class assignment_3 {

	public static void main(String[] args) {
		System.out.print("���� ������ �Է��ϼ��� : ");
		int num = new Scanner(System.in).nextInt();
		if(isPrime(num))
			System.out.println(num+"�� �Ҽ��Դϴ�.");
		else
			System.out.println(num+"�� �Ҽ��� �ƴմϴ�.");
	}
	public static boolean isPrime(int i) {
		if(i==1) {return false;}
		for(int j=2;j<i;j++) {
			if(i%j == 0) {
				return false;
			}
		}
		return true;
	}
}