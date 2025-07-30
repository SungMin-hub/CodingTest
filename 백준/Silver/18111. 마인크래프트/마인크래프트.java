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
		int B = Integer.parseInt(st.nextToken());

		int[][] arr = new int[N][M];
		int min = Integer.MAX_VALUE;
		int max = 0;

		for(int i=0; i<N; i++){
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<M; j++){
				arr[i][j] = Integer.parseInt(st.nextToken());
				min = Math.min(min, arr[i][j]);
				max = Math.max(max, arr[i][j]);
			}
		}

		int time = Integer.MAX_VALUE;
		int high = 0;

		for(int i=min; i<=max; i++){
			int cnt = 0;
			int block = B;

			for(int j=0; j<N; j++){
				for(int k=0; k<M; k++){
					int cur = arr[j][k];
					if(i < cur) {
						cnt += ((cur - i) * 2);
						block += (cur - i);
					}else {
						cnt += (i - cur);
						block -= (i - cur);
					}
				}
			}
			if(block < 0) break;

			if(time >= cnt) {
				time = cnt;
				high = i;
			}
		}

		System.out.println(time + " " + high);
	}
}