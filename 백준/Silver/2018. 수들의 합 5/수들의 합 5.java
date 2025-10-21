import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		int s = 1;
		int e = 1;
		int sum = 1;
		int cnt = 1;

		while(e != N){
			if(sum == N){
				cnt++;
				e++;
				sum += e;
			} else if(sum < N){
				e++;
				sum += e;
			} else {
				sum -= s;
				s++;
			}
		}

		System.out.println(cnt);
	}
}