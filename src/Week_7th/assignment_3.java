package Week_7th;
import java.util.Scanner;
public class assignment_3 {

	public static void main(String[] args) {
		System.out.print("양의 정수를 입력하세요 : ");
		int num = new Scanner(System.in).nextInt();
		if(isPrime(num))
			System.out.println(num+"는 소수입니다.");
		else
			System.out.println(num+"는 소수가 아닙니다.");
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