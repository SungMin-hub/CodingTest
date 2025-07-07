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

		int sum = 0;

		for(int i=0; i<L; i++){
			int n = str.charAt(i) - 'a' + 1;
			sum += (n * (int)Math.pow(r,i)) % M;
		}
		System.out.println(sum);
	}
}
