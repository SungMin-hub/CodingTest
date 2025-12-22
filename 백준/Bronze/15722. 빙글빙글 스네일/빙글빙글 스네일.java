import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		int[] dx = {0, 1, 0, -1};
		int[] dy = {1, 0, -1, 0};

		int x = 0, y = 0;
		int dir = 0;
		int len = 1;
		int used = 0;

		while (T > 0) {
			for (int i = 0; i < len && T > 0; i++) {
				x += dx[dir];
				y += dy[dir];
				T--;
			}

			dir = (dir + 1) % 4;
			used++;

			if (used == 2) {
				used = 0;
				len++;
			}
		}

		System.out.println(x + " " + y);
	}
}