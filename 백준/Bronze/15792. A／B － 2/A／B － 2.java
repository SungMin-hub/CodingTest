import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		BigInteger A = new BigInteger(st.nextToken());
		BigInteger B = new BigInteger(st.nextToken());

		StringBuilder sb = new StringBuilder();
		sb.append(A.divide(B)).append(".");

		BigInteger remain = A.mod(B);

		for(int i = 0; i< 1000; i++){
			remain = remain.multiply(BigInteger.TEN);
			sb.append(remain.divide(B));
			remain = remain.mod(B);
		}

		System.out.println(sb);
	}
}