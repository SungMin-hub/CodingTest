import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();

		if (s.length() <= 2) {
			System.out.println("◝(⑅•ᴗ•⑅)◜..°♡ 뀌요미!!");
			return;
		}

		int diff = (s.charAt(1) - '0') - (s.charAt(0) - '0');
		boolean cute = true;

		for (int i = 2; i < s.length(); i++) {
			int currentDiff = (s.charAt(i) - '0') - (s.charAt(i - 1) - '0');
			if (currentDiff != diff) {
				cute = false;
				break;
			}
		}

		if (cute) {
			System.out.println("◝(⑅•ᴗ•⑅)◜..°♡ 뀌요미!!");
		} else {
			System.out.println("흥칫뿡!! <(￣ ﹌ ￣)>");
		}
	}
}