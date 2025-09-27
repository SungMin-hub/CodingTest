import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		boolean found = false;
		for (int i = 0; i < N; i++) {
			String s = br.readLine();
			if (s.equals("anj")) {
				found = true;
			}
		}

		if (found) {
			System.out.println("뭐야;");
		} else {
			System.out.println("뭐야?");
		}
	}
}
