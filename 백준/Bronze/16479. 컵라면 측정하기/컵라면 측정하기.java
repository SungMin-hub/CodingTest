import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double K = Double.parseDouble(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		double D1 = Double.parseDouble(st.nextToken());
		double D2 = Double.parseDouble(st.nextToken());

		double ans = K * K - Math.pow((D1 - D2) / 2.0, 2);
		System.out.println(ans);
	}
}
