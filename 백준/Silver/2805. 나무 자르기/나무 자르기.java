import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		long[] arr = new long[N];
		st = new StringTokenizer(br.readLine());
		long max = 0;
		for(int i = 0; i < N; i++){
			arr[i] = Integer.parseInt(st.nextToken());
			max = Math.max(max, arr[i]);
		}

		long cur = 0;
		long mid = 0;
		while(cur <= max){
			mid = (cur + max)/2;
			long sum = 0;

			for(int i=0; i<N; i++){
				if(mid <= arr[i]){
					sum += arr[i] - mid;
				}
			}

			if(sum >= M){
				cur = mid + 1;
			} else {
				max = mid -1;
			}
		}
		System.out.println(max);
	}
}