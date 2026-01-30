import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());

		StringBuilder sb = new StringBuilder();

		if(m == 0){
			System.out.println(0);
			return;
		}

		while(m > 0){
			int num = m % n;

			if(num >= 10){
				sb.append((char)(num - 10 + 'A'));
			} else {
				sb.append(num);
			}

			m = m / n;
		}

		System.out.println(sb.reverse());
	}
}
