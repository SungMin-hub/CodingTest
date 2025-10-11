import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken()+N);
		
		if(isPrime(N) && isPrime(M)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
	public static boolean isPrime(int a) {
		if(a<2) return false;
		for(int i=2;i<=Math.sqrt(a);i++) {
			if(a%i==0) return false;
		}
		return true;
	}
}