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

		StringBuilder sb = new StringBuilder();
		for(int i=N; i<=M; i++){
			if(!isPrime(i)) continue;
			sb.append(i).append("\n");
		}
		System.out.println(sb);

	}
	private static boolean isPrime(int n){
		if(n < 2) return false;
		for(int i=2; i * i <= n; i++){
			if(n % i == 0) return false;
		}
		return true;
	}
}