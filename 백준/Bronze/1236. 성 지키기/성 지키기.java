import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] arr = br.readLine().split(" ");
		int R = Integer.parseInt(arr[0]);
		int C = Integer.parseInt(arr[1]);

		char[][] map = new char[R][C];

		for (int i = 0; i < R; i++) {
			String line = br.readLine();
			map[i] = line.toCharArray();
		}

		boolean[] rowCheck = new boolean[R];
		boolean[] colCheck = new boolean[C];

		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				if (map[i][j] == 'X') {
					rowCheck[i] = true;
					colCheck[j] = true;
				}
			}
		}

		int rowNeed = 0;
		int colNeed = 0;

		for (int i = 0; i < R; i++) {
			if (!rowCheck[i])
				rowNeed++;
		}
		for (int j = 0; j < C; j++) {
			if (!colCheck[j])
				colNeed++;
		}

		System.out.println(Math.max(rowNeed, colNeed));
	}
}