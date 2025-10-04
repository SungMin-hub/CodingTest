import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long K = Long.parseLong(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		long D1 = Long.parseLong(st.nextToken());
		long D2 = Long.parseLong(st.nextToken());

		System.out.println(K * K - (D1 - D2) * (D1 - D2)) ;
	}
}

