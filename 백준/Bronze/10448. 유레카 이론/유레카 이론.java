import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static int[] tri = new int[45];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for (int i = 1; i <= 44; i++) {
			tri[i] = i * (i + 1) / 2;
		}

		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();

		while (T-- > 0) {
			int K = Integer.parseInt(br.readLine());
			sb.append(check(K)).append("\n");
		}

		System.out.print(sb);
	}

	static int check(int K) {
		for (int i = 1; i <= 44; i++) {
			for (int j = 1; j <= 44; j++) {
				for (int k = 1; k <= 44; k++) {
					if (tri[i] + tri[j] + tri[k] == K) {
						return 1;
					}
				}
			}
		}
		return 0;
	}
}