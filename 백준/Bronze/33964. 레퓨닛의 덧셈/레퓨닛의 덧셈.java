import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int X = Integer.parseInt(st.nextToken());
		int Y = Integer.parseInt(st.nextToken());

		int min = Math.min(X, Y);
		int diff = Math.abs(X - Y);

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < diff; i++) {
			sb.append('1');
		}

		for (int i = 0; i < min; i++) {
			sb.append('2');
		}

		System.out.println(sb);


	}
}
