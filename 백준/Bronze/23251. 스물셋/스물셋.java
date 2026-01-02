import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine().trim());
		for (int i = 0; i < T; i++) {
			long k = Long.parseLong(br.readLine().trim());
			long result = 23 * k;
			sb.append(result).append("\n");
		}

		System.out.print(sb);
	}
}
