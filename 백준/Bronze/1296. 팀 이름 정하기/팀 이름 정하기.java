import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		int N = Integer.parseInt(br.readLine());

		int baseL = 0, baseO = 0, baseV = 0, baseE = 0;

		for (char c : str.toCharArray()) {
			if (c == 'L') baseL++;
			else if (c == 'O') baseO++;
			else if (c == 'V') baseV++;
			else if (c == 'E') baseE++;
		}

		int max = -1;
		String ans = "";

		for (int i = 0; i < N; i++) {
			String team = br.readLine();

			int L = baseL;
			int O = baseO;
			int V = baseV;
			int E = baseE;

			for (char c : team.toCharArray()) {
				if (c == 'L') L++;
				else if (c == 'O') O++;
				else if (c == 'V') V++;
				else if (c == 'E') E++;
			}

			int score = ((L + O) * (L + V) * (L + E)
				* (O + V) * (O + E) * (V + E)) % 100;

			if (score > max) {
				max = score;
				ans = team;
			} else if (score == max) {
				if (team.compareTo(ans) < 0) {
					ans = team;
				}
			}
		}

		System.out.println(ans);
	}
}