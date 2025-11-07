import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		int[] basket = new int[N];
		for (int i = 0; i < N; i++) {
			basket[i] = i + 1;
		}

		for (int m = 0; m < M; m++) {
			st = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(st.nextToken()) - 1;
			int j = Integer.parseInt(st.nextToken()) - 1;
			int k = Integer.parseInt(st.nextToken()) - 1;

			int[] temp = new int[j - i + 1];
			int idx = 0;

			for (int t = k; t <= j; t++) {
				temp[idx++] = basket[t];
			}
			for (int t = i; t < k; t++) {
				temp[idx++] = basket[t];
			}

			idx = 0;
			for (int t = i; t <= j; t++) {
				basket[t] = temp[idx++];
			}
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < N; i++) {
			sb.append(basket[i]).append(" ");
		}
		System.out.println(sb);
	}
}