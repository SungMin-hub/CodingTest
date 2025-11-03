import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());;
		
		char[] colors = new char[n];
		for (int i = 0; i < n; i++) {
			colors[i] = st.nextToken().charAt(0);
		}

		st = new StringTokenizer(br.readLine());
		int m = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());

		boolean ans = false;

		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			boolean white = true;

			for (int j = 0; j < k; j++) {
				int idx = Integer.parseInt(st.nextToken()) - 1;
				if (colors[idx] == 'P') {
					white = false;
				}
			}

			if (white) {
				ans = true;
			}
		}

		System.out.println(ans ? "W" : "P");
	}
}