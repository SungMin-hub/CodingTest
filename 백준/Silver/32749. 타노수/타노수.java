import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int T = Integer.parseInt(st.nextToken());

		String X = br.readLine();

		int len = (int) Math.pow(2, N - T);

		String ans = "";
		for (int i = 0; i < X.length(); i += len) {
			String s = X.substring(i, i + len);
			if (s.compareTo(ans) > 0) {
				ans = s;
			}
		}

		System.out.println(ans);
	}
}