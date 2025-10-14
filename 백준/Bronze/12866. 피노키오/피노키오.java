import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int L = Integer.parseInt(br.readLine());
		String s = br.readLine();

		long chA = 0, chC = 0, chG = 0, chT = 0;

		for(int i=0; i<L; i++) {
			char c = s.charAt(i);
			if(c == 'A') chA++;
			else if(c == 'C') chC++;
			else if(c == 'G') chG++;
			else if(c == 'T') chT++;
		}

		long ans = 1;
		long mod = 1000000007;
		ans = (ans * (chA % mod)) % mod;
		ans = (ans * (chC % mod)) % mod;
		ans = (ans * (chG % mod)) % mod;
		ans = (ans * (chT % mod)) % mod;

		System.out.println(ans);
	}
}