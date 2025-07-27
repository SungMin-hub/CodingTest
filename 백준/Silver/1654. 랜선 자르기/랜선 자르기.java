import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int K = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());

		long max = 0;

		long[] arr = new long[K];

		for(int i=0; i<K; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			if (arr[i] > max) max = arr[i];
		}

		long mid = 1;
		long min = 1;
		long ans = 0;

		while(min <= max){
			long cnt = 0;
			mid = min + (max - min) / 2;

			for(int i=0; i<K; i++) {
				cnt += (arr[i] / mid);
			}

			if(cnt >= N){
				ans = mid;
				min = mid + 1;
			} else {
				max = mid - 1;
			}
		}
		System.out.println(ans);
	}
}