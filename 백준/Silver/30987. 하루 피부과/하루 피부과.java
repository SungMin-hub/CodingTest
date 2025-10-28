import static java.lang.Math.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int x1 = Integer.parseInt(st.nextToken());
		int x2 = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());
		long a = Long.parseLong(st.nextToken());
		long b = Long.parseLong(st.nextToken());
		long c = Long.parseLong(st.nextToken());
		long d = Long.parseLong(st.nextToken());
		long e = Long.parseLong(st.nextToken());

		long A = a;
		long B = b - d;
		long C = c - e;

		long f = f(A,B,C,x2) - f(A,B,C,x1);
		System.out.println(f);
	}
	static long f(long A, long B, long C, long x) {
		return A*x*x*x/3 + B*x*x/2 + C*x;
	}
}