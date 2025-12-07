import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String document = br.readLine();
		String word = br.readLine();

		int cnt = 0;
		int idx = 0;
		int docLen = document.length();
		int wordLen = word.length();

		while (idx <= docLen - wordLen) {
			boolean match = true;
			for (int i = 0; i < wordLen; i++) {
				if (document.charAt(idx + i) != word.charAt(i)) {
					match = false;
					break;
				}
			}

			if (match) {
				cnt++;
				idx += wordLen;
			} else {
				idx++;
			}
		}

		System.out.println(cnt);
	}
}