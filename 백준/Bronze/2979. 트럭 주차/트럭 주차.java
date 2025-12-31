import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());

		int[] time = new int[101];

		for (int i = 0; i < 3; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());

			for (int t = start; t < end; t++) {
				time[t]++;
			}
		}

		int ans = 0;
		for (int t = 0; t < 101; t++) {
			if (time[t] == 1) ans += A;
			else if (time[t] == 2) ans += 2 * B;
			else if (time[t] == 3) ans += 3 * C;
		}

		System.out.println(ans);
	}
}
