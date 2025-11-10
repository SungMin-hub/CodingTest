import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine().trim());
		StringBuilder sb = new StringBuilder();

		for (int tc = 0; tc < T; tc++) {
			int N = Integer.parseInt(br.readLine().trim());
			double min = Double.MAX_VALUE;
			int ans = Integer.MAX_VALUE;

			for (int i = 0; i < N; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int W = Integer.parseInt(st.nextToken());
				int C = Integer.parseInt(st.nextToken());

				double rate = (double) C / W;

				if (rate < min) {
					min = rate;
					ans = C;
				} else if (rate == min) {
					if (C < ans) {
						ans = C;
					}
				}
			}

			sb.append(ans).append('\n');
		}

		System.out.print(sb);

	}
}