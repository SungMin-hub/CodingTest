import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		int min = Integer.MAX_VALUE;
		int[] arr = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());

		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			min = Math.min(min, arr[i]);
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= min; i++) {
			boolean isTrue = true;
			for (int x : arr) {
				if (x % i != 0) {
					isTrue = false;
					break;
				}
			}
			if (isTrue) sb.append(i).append("\n");
		}

		System.out.print(sb);
	}
}