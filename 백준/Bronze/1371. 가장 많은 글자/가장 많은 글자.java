import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] cnt = new int[26];

		String line;
		while ((line = br.readLine()) != null) {
			for (int i = 0; i < line.length(); i++) {
				char c = line.charAt(i);
				if (c >= 'a' && c <= 'z') {
					cnt[c - 'a']++;
				}
			}
		}

		int max = 0;
		for (int i = 0; i < 26; i++) {
			max = Math.max(max, cnt[i]);
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 26; i++) {
			if (cnt[i] == max) {
				sb.append((char) (i + 'a'));
			}
		}

		System.out.print(sb);
	}
}
