import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine().trim());

		for (int t = 1; t <= T; t++) {
			int N = Integer.parseInt(br.readLine().trim());
			String line = br.readLine().trim();

			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < N; i++) {
				String chunk = line.substring(i * 8, (i + 1) * 8);
				int value = 0;
				for (int j = 0; j < 8; j++) {
					value <<= 1;
					if (chunk.charAt(j) == 'I') {
						value |= 1;
					}
				}
				sb.append((char)value);
			}

			System.out.println("Case #" + t + ": " + sb.toString());
		}

	}
}
