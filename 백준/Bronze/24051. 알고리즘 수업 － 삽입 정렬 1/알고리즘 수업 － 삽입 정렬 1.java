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

		int[] arr = new int[N];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		int cnt = 0;
		int ans = -1;

		for (int i = 1; i < N; i++) {
			int key = arr[i];
			int j = i - 1;

			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				cnt++;
				if (cnt == K) {
					ans = arr[j + 1];
					System.out.println(ans);
					return;
				}
				j--;
			}

			if (j + 1 != i) {
				arr[j + 1] = key;
				cnt++;
				if (cnt == K) {
					ans = key;
					System.out.println(ans);
					return;
				}
			}
		}

		System.out.println(-1);
	}
}
