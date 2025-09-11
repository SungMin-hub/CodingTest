import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		long ans = 1;

		if(N==0){
			System.out.println(1);
			return;
		}

		for(long i = 1; i <= N; i++) {
			ans*= i;
		}
		System.out.println(ans);
	}
}
