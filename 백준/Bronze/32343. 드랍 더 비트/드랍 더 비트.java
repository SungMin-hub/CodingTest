import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());

		ArrayList<Integer> arr1 = new ArrayList<>();
		ArrayList<Integer> arr2 = new ArrayList<>();

		int limit = 1 << n;
		for (int i = 0; i < limit; i++) {
			int ones = Integer.bitCount(i);
			if (ones == a) {
				arr1.add(i);
			}
			if (ones == b) {
				arr2.add(i);
			}
		}

		int ans = 0;
		for (int x : arr1) {
			for (int y : arr2) {
				ans = Math.max(ans, x ^ y);
			}
		}

		System.out.println(ans);
	}
}
