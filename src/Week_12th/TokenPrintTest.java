package Week_12th;

import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class TokenPrintTest {
	public static void main(String[] args) {
		String s = "of the people, by the people, for the people";
		String token;

		StringTokenizer st = new StringTokenizer(s, " ,");

		while (true) {
			try {
				token = st.nextToken();
			} catch (NoSuchElementException e) {
				break;
			}
			System.out.println(token);
		}
	}
}
