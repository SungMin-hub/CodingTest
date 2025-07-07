import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int L = Integer.parseInt(br.readLine());
		String str = br.readLine();

		int r = 31;
		int M = 1234567891;

		long sum = 0;
		long pow = 1;

		for(int i=0; i<L; i++){
			long n = str.charAt(i) - 'a' + 1;
			sum = (sum + n * pow % M) % M;
			pow = (r * pow) % M;
		}
		System.out.println(sum);
	}
}
