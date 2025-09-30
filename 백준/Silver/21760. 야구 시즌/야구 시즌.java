import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();

		while (T-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			int D = Integer.parseInt(st.nextToken());

			int part1 = N * k * (M * (M - 1) / 2);
			int part2 = (N * (N - 1) / 2) * (M * M);
			int C = part1 + part2;

			if (C == 0) {
				sb.append("-1\n");
				continue;
			}

			long B = D / C;
			if (B < 1) {
				sb.append("-1\n");
			} else {
				long G = B * C;
				sb.append(G).append("\n");
			}
		}

		System.out.println(sb);
	}
}
