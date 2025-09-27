import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		int a = 1;
		while(a*(a+1)/2 < N){
			a++;
		}

		int b = N - (a - 1) * a / 2;
		int x = b;
		int y = a + 1 - b;

		System.out.println(y + " " + x);
	}
}
