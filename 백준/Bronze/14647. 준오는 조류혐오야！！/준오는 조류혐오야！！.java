import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		int[] row = new int[n];
		int[] col = new int[m];

		int total = 0;

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < m; j++) {
				String num = st.nextToken();
				for (char c : num.toCharArray()) {
					if (c == '9') {
						total++;
						row[i]++;
						col[j]++;
					}
				}
			}
		}

		int max = 0;

		for (int i = 0; i < n; i++) {
			max = Math.max(max, row[i]);
		}

		for (int j = 0; j < m; j++) {
			max = Math.max(max, col[j]);
		}

		System.out.println(total - max);
	}
}
