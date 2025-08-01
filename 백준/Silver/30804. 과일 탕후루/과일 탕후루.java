import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];

		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++){
			arr[i] = Integer.parseInt(st.nextToken());
		}

		int max = 0;

		for(int i=1;i<=9;i++){
			for(int j=i;j<=9;j++){
				int len = 0;
				for(int k=0;k<N;k++){
					if(arr[k] == i || arr[k] == j){
						len++;
						max = Math.max(max,len);
					} else {
						len = 0;
					}
				}
			}
		}

		System.out.println(max);
	}
}