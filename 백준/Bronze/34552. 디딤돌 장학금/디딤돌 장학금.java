import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int[] arr = new int[11];
		for (int i = 0; i < 11; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		int N = Integer.parseInt(br.readLine());
		int ans = 0;

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int B = Integer.parseInt(st.nextToken());
			double L = Double.parseDouble(st.nextToken());
			int S = Integer.parseInt(st.nextToken());

			if (L >= 2.0 && S >= 17) {
				ans += arr[B];
			}
		}

		System.out.println(ans);
	}
}