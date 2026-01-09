import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] A = new int[10];
		int[] B = new int[10];

		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < 10; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < 10; i++) {
			B[i] = Integer.parseInt(st.nextToken());
		}

		int sA = 0;
		int sB = 0;
		char winner = 'D';

		for (int i = 0; i < 10; i++) {
			if (A[i] > B[i]) {
				sA += 3;
				winner = 'A';
			} else if (A[i] < B[i]) {
				sB += 3;
				winner = 'B';
			} else {
				sA += 1;
				sB += 1;
			}
		}

		System.out.println(sA + " " + sB);

		if (sA > sB) {
			System.out.println("A");
		} else if (sA < sB) {
			System.out.println("B");
		} else {
			System.out.println(winner);
		}
	}
}
