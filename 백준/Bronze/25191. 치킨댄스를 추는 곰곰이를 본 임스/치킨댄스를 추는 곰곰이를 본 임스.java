import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A  = Integer.parseInt(st.nextToken());
		int B  = Integer.parseInt(st.nextToken());

		System.out.println(Math.min(N, A / 2 + B));

	}
}