import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());

			StringBuilder line = new StringBuilder();
			for (int j = 0; j < N; j++) {
				int val = Integer.parseInt(st.nextToken());
				for (int x = 0; x < K; x++) {
					line.append(val).append(" ");
				}
			}

			for (int y = 0; y < K; y++) {
				sb.append(line).append("\n");
			}
		}

		System.out.print(sb);
	}
}
