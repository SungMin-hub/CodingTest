import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int M = Integer.parseInt(br.readLine());

		int dir = 0;
		long rpm = 1;

		for (int i = 0; i < M; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			long a = Long.parseLong(st.nextToken());
			long b = Long.parseLong(st.nextToken());
			int s = Integer.parseInt(st.nextToken());

			if (s == 1) {
				dir = 1 - dir;
			}
			
			rpm = rpm / a * b;
		}

		System.out.println(dir + " " + rpm);
	}
}