import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		int idx = 0;
		int i=0;

		while(true){
			i++;
			if(Integer.toString(i).contains("666")) arr[idx++] = i;
			if(idx == N) break;
		}
		System.out.println(arr[N-1]);
	}
}