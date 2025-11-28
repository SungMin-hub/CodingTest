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

		st = new StringTokenizer(br.readLine());
		int ans = 0;

		for (int i = 0; i < K; i++) {
			int n = Integer.parseInt(st.nextToken());
			ans += (n + 1) / 2;
		}

		if (ans >= N) System.out.println("YES");
		else System.out.println("NO");

	}
}