import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static int[][] arr = new int[41][2];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());

		arr[0][0] = 1;
		arr[0][1] = 0;
		arr[1][0] = 0;
		arr[1][1] = 1;

		for(int i=0;i<T;i++){
			int n = Integer.parseInt(br.readLine());
			fibonacci(n);
			System.out.println(arr[n][0] + " " + arr[n][1]);
		}
	}
	private static int[] fibonacci(int n) {
		if(arr[n][0] == 0 && arr[n][1] == 0){
			arr[n][0] = fibonacci(n-1)[0] + fibonacci(n-2)[0];
			arr[n][1] = fibonacci(n-1)[1] + fibonacci(n-2)[1];
		}
		return arr[n];
	}
}