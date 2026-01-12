import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		boolean[] arr = new boolean[10];
		for (int i = 0; i < 5; i++) {
			int x = Integer.parseInt(st.nextToken());
			arr[x] = true;
		}

		int ans = 5;

		for (int start = 1; start <= 5; start++) {
			int same = 0;
			for (int i = 0; i < 5; i++) {
				if (arr[start + i]) {
					same++;
				}
			}
			ans = Math.min(ans, 5 - same);
		}

		System.out.println(ans);
	}
}
