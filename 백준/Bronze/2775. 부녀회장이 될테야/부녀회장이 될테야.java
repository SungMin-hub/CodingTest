import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		int[][] arr = new int[T][2];

		for(int i=0;i<T;i++){
			arr[i][0] = Integer.parseInt(br.readLine());
			arr[i][1] = Integer.parseInt(br.readLine());
		}

		for(int i=0;i<T;i++){
			System.out.println(room(arr[i][0],arr[i][1]));
		}
	}
	private static int room(int k, int n){
		if(k == 0) return n;
		if(n == 1) return 1;

		return room(k,n-1) + room(k-1,n);
	}
}