import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(st.nextToken()) - 1;
		int C = Integer.parseInt(st.nextToken()) - 1;

		int parity = (R + C) % 2;

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if ((i + j) % 2 == parity) {
					sb.append('v');
				} else {
					sb.append('.');
				}
			}
			sb.append('\n');
		}

		System.out.print(sb);
	}
}
