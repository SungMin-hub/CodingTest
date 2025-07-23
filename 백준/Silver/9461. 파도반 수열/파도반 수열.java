import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();

		long[] dp = new long[101];

		dp[1] = dp[2] = dp[3] = 1;
		dp[4] = dp[5] = 2;

		for(int i=6; i<101; i++){
			dp[i] = dp[i-1] + dp[i-5];
		}

		for(int i=0;i<T;i++){
			int N = Integer.parseInt(br.readLine());
			sb.append(dp[N]).append("\n");
		}
		System.out.println(sb);
	}
}