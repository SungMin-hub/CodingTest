import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String S = br.readLine();
		String K = br.readLine();

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < S.length(); i++) {
			char c = S.charAt(i);
			if (!Character.isDigit(c)) {
				sb.append(c);
			}
		}

		if (sb.toString().contains(K)) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}
}
