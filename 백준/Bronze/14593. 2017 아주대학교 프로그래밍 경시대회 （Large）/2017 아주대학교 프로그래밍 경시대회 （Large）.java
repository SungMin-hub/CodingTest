import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[][] arr = new int[N][3];

		for(int i = 0; i < N; i++){
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
			arr[i][2] = Integer.parseInt(st.nextToken());
		}

		int ans = 0;
		for(int i=1; i<N; i++){
			if(isWinner(arr[i],arr[ans])){
				ans = i;
			}
		}
		System.out.println(ans+1);
	}
	private static boolean isWinner(int[] a, int[] b){
		if (a[0] != b[0]) return a[0] > b[0];
		if (a[1] != b[1]) return a[1] < b[1];
		return a[2] < b[2];
	}
}
