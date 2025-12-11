import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for (int t = 0; t < 3; t++) {
			int n = Integer.parseInt(br.readLine());
			BigInteger sum = BigInteger.ZERO;

			for (int i = 0; i < n; i++) {
				BigInteger num = new BigInteger(br.readLine());
				sum = sum.add(num);
			}

			int compare = sum.compareTo(BigInteger.ZERO);

			if (compare > 0) System.out.println("+");
			else if (compare < 0) System.out.println("-");
			else System.out.println("0");
		}
	}
}