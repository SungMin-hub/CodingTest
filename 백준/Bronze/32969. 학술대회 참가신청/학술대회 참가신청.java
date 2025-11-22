import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();

		String[] arr = { "social", "history", "language", "literacy" };

		boolean ans = false;
		for (String k : arr) {
			if (str.contains(k)) {
				ans = true;
				break;
			}
		}

		if (ans) {
			System.out.println("digital humanities");
		} else {
			System.out.println("public bigdata");
		}
	}
}