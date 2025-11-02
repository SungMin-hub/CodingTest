import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < T; i++) {
			String s = br.readLine();

			if (check(s)) sb.append("1\n");
			else sb.append("0\n");
		}

		System.out.print(sb);
	}
	static boolean check(String s) {
		if (s.length() != 7) return false;

		char a = s.charAt(0);
		char b = s.charAt(2);

		if (a == b) return false;

		return s.equals("" + a + a + b + b + a + b + b);
	}
}