import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());

		int cur = 0;
		long ans = 0;

		for (int i = 0; i < N; i++) {
			int X = Integer.parseInt(st.nextToken());
			int target = X - 1;

			if (target < cur) {
				System.out.println(-1);
				return;
			}

			int d = target - cur;
			ans += d / 2;
			ans += d % 2;

			ans += 1;
			cur = X + 1;
		}

		System.out.println(ans);
	}
}
