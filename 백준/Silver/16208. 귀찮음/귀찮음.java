import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		long[] arr = new long[n];
		long sum = 0;
		for (int i = 0; i < n; i++) {
			arr[i] = Long.parseLong(st.nextToken());
			sum += arr[i];
		}

		if(n==1){
			System.out.println(0);
			return;
		}

		Arrays.sort(arr);

		long ans = 0;
		for (int i = 0; i < n; i++) {
			long a = arr[i];
			sum -= a;
			ans += a * sum;
		}

		System.out.println(ans);

	}
}