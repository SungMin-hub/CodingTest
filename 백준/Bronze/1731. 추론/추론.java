import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		int[] arr = new int[N];
		for(int i = 0; i < N; i++){
			arr[i] = Integer.parseInt(br.readLine());
		}

		int a1 = arr[0];
		int a2 = arr[1];
		int a3 = arr[2];

		int ans;

		if (a2 - a1 == a3 - a2) {
			ans = arr[N - 1] + (a2 - a1);
		} else {
			ans = arr[N - 1] * (a2 / a1);
		}

		System.out.println(ans);

	}
}