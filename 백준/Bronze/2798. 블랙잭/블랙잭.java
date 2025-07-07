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

		int[] arr = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		int sumMax = 0;

		for(int i=0; i<N; i++){
			int sum = 0;
			for(int j=0; j<N && i!=j; j++){
				for(int k=0; k<N && j!=k && i!=k; k++){
					sum = arr[i] + arr[j] + arr[k];
					if(sum <= M)
						sumMax = Math.max(sumMax, sum);
				}
			}
		}
		System.out.println(sumMax);
	}
}
