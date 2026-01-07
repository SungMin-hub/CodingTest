import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int sum = -8;
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			sum += Integer.parseInt(st.nextToken())+8;
		}
		int d = 0;

		while(sum >= 24){
			sum -= 24;
			d++;
		}
		System.out.println(d + " " + sum);
	}
}
