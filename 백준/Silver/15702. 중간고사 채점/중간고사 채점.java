import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		int[] score = new int[N];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			score[i] = Integer.parseInt(st.nextToken());
		}

		int max = -1;
		int best = Integer.MAX_VALUE;

		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int num = Integer.parseInt(st.nextToken());
			int sum = 0;

			for (int j = 0; j < N; j++) {
				String answer = st.nextToken();
				if (answer.equals("O")) {
					sum += score[j];
				}
			}

			if (sum > max || (sum == max && num < best)) {
				max = sum;
				best = num;
			}
		}

		System.out.println(best + " " + max);
	}
}
