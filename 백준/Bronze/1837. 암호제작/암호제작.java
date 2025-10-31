import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		BigInteger P = new BigInteger(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		boolean[] arr = new boolean[K];
		Arrays.fill(arr, true);
		arr[0] = arr[1] = false;

		for(int i = 2; i*i < K; i++) {
			if(arr[i]){
				for(int j = i * i; j < K; j += i) {
					arr[j] = false;
				}
			}
		}

		for(int i = 2; i < K; i++) {
			if(arr[i]){
				if(P.mod(BigInteger.valueOf(i)).equals(BigInteger.ZERO)){
					System.out.println("BAD " + i);
					return;
				}
			}
		}

		System.out.println("GOOD");
	}
}