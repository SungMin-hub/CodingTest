import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		StringTokenizer st = new StringTokenizer(br.readLine());

		long sum = 0;
		long min = Long.MAX_VALUE;

		for (int i = 0; i < N; i++) {
			long num = Long.parseLong(st.nextToken());
			sum += num;
			min = Math.min(min, num);
		}

		long ans = Math.max(sum, -min);
		System.out.println(ans);
	}
}
