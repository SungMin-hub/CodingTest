import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s = "`1234567890-=QWERTYUIOP[]\\ASDFGHJKL;'ZXCVBNM,./";

		String line;
		while ((line = br.readLine()) != null) {
			StringBuilder sb = new StringBuilder();

			for (char c : line.toCharArray()) {
				if (c == ' ') {
					sb.append(' ');
					continue;
				}

				int idx = s.indexOf(c);
				if (idx > 0) {
					sb.append(s.charAt(idx - 1));
				}
			}

			System.out.println(sb);
		}

	}
}