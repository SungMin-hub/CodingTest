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

		int[] arr = new int[N+1];
		int[] prifixSum = new int[N+1];

		st = new StringTokenizer(br.readLine());
		for(int i=1;i<=N;i++){
			arr[i] = Integer.parseInt(st.nextToken());
			prifixSum[i] = prifixSum[i-1] + arr[i];
		}

		StringBuilder sb = new StringBuilder();
		for(int k=0;k<M;k++){
			st = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			sb.append(prifixSum[j] - prifixSum[i-1]).append("\n");
		}
		System.out.println(sb);
	}
}