import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());

		while (T-- > 0) {
			int N = Integer.parseInt(br.readLine());

			String maxS = "";
			int maxD = -1;

			for (int i = 0; i < N; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				String s = st.nextToken();
				int d = Integer.parseInt(st.nextToken());

				if (d > maxD) {
					maxD = d;
					maxS = s;
				}
			}

			sb.append(maxS).append("\n");
		}

		System.out.print(sb);
	}
}
