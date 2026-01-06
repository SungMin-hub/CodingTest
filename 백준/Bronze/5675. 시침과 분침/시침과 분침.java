import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		boolean[] arr = new boolean[181];

		for (int t = 0; t < 720; t++) {
			int min = t % 60;
			int hour = (t / 12) % 60;

			int diff = Math.abs(min - hour);
			diff = Math.min(diff, 60 - diff);

			int angle = diff * 6;
			arr[angle] = true;
		}

		String line;
		while ((line = br.readLine()) != null) {
			int A = Integer.parseInt(line.trim());
			System.out.println(arr[A] ? "Y" : "N");
		}
	}
}
