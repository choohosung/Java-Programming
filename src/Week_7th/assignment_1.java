package Week_7th;
import java.util.Scanner;
public class assignment_1 {

	public static void main(String[] args) {
		int result=1;
		int n;
		Scanner in = new Scanner(System.in);
		System.out.print("팩토리얼 값 구할 정수를 다시 입력하세요(10~500) : ");
		while(true) {
			n = in.nextInt();
			if(n>=10 && n<=500) {
				result = factorial(n);
				System.out.println(result);
				break;
			}
			else {
				System.out.print("팩토리얼 값 구할 정수를 다시 입력하세요(10~500) : ");
			}
		}
	}
	static int factorial(int x) {
		int r = 1;
		while(x>0) {
			r=x*r;
			x--;
		}
		return r;
	}
}
