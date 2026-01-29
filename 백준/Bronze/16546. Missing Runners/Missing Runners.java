import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N+1];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<N-1; i++){
			int num = Integer.parseInt(st.nextToken());
			arr[num] = 1;
		}
		int ans = 0;
		for(int i=1; i<=N; i++){
			if(arr[i] == 0){
				ans = i;
			}
		}
		System.out.println(ans);
	}
}
