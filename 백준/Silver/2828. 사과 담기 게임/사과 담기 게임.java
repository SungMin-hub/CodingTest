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

		int K = Integer.parseInt(br.readLine());

		int left = 1;
		int right = M;
		int move = 0;

		for (int i = 0; i < K; i++) {
			int pos = Integer.parseInt(br.readLine());

			if (pos < left) {
				move += (left - pos);
				right -= (left - pos);
				left = pos;
			} else if (pos > right) {
				move += (pos - right);
				left += (pos - right);
				right = pos;
			}
			
		}

		System.out.println(move);
	}
}
