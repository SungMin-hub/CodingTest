import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine().trim());
		StringBuilder sb = new StringBuilder();
		while (T-- > 0) {
			String s = br.readLine();
			String replaced = s.replace("PO", "PHO");
			sb.append(replaced).append("\n");
		}
		System.out.print(sb);
	}
}