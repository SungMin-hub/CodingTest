import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < T; i++) {
			long time = Long.parseLong(br.readLine());

			if (time % 25 < 17) {
				sb.append("ONLINE\n");
			} else {
				sb.append("OFFLINE\n");
			}
		}

		System.out.print(sb);
	}
}