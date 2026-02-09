import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++) {
			int t = 0;
			int r = 0;

			while (true) {
				String line = br.readLine();

				if (line == null || line.isEmpty()) {
					break;
				}

				for (char c : line.toCharArray()) {
					t++;
					if (c != '#') {
						r++;
					}
				}
			}

			double ratio = (double) r * 100 / t;

			double round = Math.round(ratio * 10) / 10.0;

			if (round == (int) round) {
				System.out.println("Efficiency ratio is " + (int) round + "%.");
			} else {
				System.out.println("Efficiency ratio is " + round + "%.");
			}
		}
	}
}
