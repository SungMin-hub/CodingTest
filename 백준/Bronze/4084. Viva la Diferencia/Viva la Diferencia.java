import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			int d = Integer.parseInt(st.nextToken());

			if (a == 0 && b == 0 && c == 0 && d == 0) {
				break;
			}

			int cnt = 0;

			while (!(a == b && b == c && c == d)) {
				int na = Math.abs(a - b);
				int nb = Math.abs(b - c);
				int nc = Math.abs(c - d);
				int nd = Math.abs(d - a);

				a = na;
				b = nb;
				c = nc;
				d = nd;

				cnt++;
			}

			System.out.println(cnt);
		}
	}
}
