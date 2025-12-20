import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());

		int[] arr = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String[] week = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};

		int ans = 0;
		
		for (int i = 0; i < x - 1; i++) {
			ans += arr[i];
		}

		ans += y;

		System.out.println(week[(ans - 1) % 7]);
	}
}