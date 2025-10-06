import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		while (T-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			String s = br.readLine();

			for(char c : s.toCharArray()) {
				int x = c - 'A';
				int code = (a * x + b) % 26;
				sb.append(((char)(code + 'A')));
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}