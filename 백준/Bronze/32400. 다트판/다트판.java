import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = 20;
		int[] board = new int[N];
		for (int i = 0; i < N; i++) {
			board[i] = Integer.parseInt(st.nextToken());
		}

		double sum = 0;
		for (int x : board) sum += x;
		double bob = sum / N;

		int idx20 = -1;
		for (int i = 0; i < N; i++) {
			if (board[i] == 20) {
				idx20 = i;
				break;
			}
		}

		int left = (idx20 - 1 + N) % N;
		int right = (idx20 + 1) % N;
		double alice = (board[left] + board[idx20] + board[right]) / 3.0;

		if (alice > bob) {
			System.out.println("Alice");
		} else if (alice < bob) {
			System.out.println("Bob");
		} else {
			System.out.println("Tie");
		}
	}
}