import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int a = Integer.parseInt(st.nextToken())-1;
		int b = Integer.parseInt(st.nextToken())-1;

		int[][] arr = new int[N][N];
		for(int i = 0; i < N; i++){
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < N; j++){
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		int X = arr[a][b];
		boolean angry = false;

		for(int i = 0; i < N; i++){
			if(arr[a][i] > X){
				angry = true;
				break;
			}
		}

		if(!angry){
			for(int i = 0; i < N; i++){
				if(arr[i][b] > X){
					angry = true;
					break;
				}
			}
		}

		System.out.println(angry ? "ANGRY" : "HAPPY");
	}
}
