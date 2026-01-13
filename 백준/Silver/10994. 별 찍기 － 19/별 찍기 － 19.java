import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static char[][] map;

	public static void draw(int x, int y, int size, int n) {
		if (n == 1) {
			map[x][y] = '*';
			return;
		}

		for (int i = y; i < y + size; i++) {
			map[x][i] = '*';
			map[x + size - 1][i] = '*';
		}

		for (int i = x; i < x + size; i++) {
			map[i][y] = '*';
			map[i][y + size - 1] = '*';
		}

		draw(x + 2, y + 2, size - 4, n - 1);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		int size = 4 * N - 3;
		map = new char[size][size];

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				map[i][j] = ' ';
			}
		}

		draw(0, 0, size, N);

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < size; i++) {
			sb.append(map[i]).append('\n');
		}

		System.out.print(sb);
	}
}
