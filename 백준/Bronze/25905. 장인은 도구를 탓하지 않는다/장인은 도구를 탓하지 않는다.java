import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		double[] p = new double[10];
		for (int i = 0; i < 10; i++) {
			p[i] = Double.parseDouble(br.readLine());
		}

		Arrays.sort(p);

		double product = 1.0;
		for (int i = 1; i < 10; i++) {
			product *= p[i];
		}

		double factorial = 1.0;
		for (int i = 1; i <= 9; i++) {
			factorial *= i;
		}

		double result = product / factorial * 1_000_000_000;

		System.out.printf("%.9f\n", result);
	}
}
