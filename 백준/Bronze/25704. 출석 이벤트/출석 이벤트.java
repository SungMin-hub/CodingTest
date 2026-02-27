import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int P = Integer.parseInt(br.readLine());

        int ans = P;

        if (N >= 5) {
            ans = Math.min(ans, P - 500);
        }
        if (N >= 10) {
            ans = Math.min(ans, (int)(P * 0.9));
        }
        if (N >= 15) {
            ans = Math.min(ans, P - 2000);
        }
        if (N >= 20) {
            ans = Math.min(ans, (int)(P * 0.75));
        }

        if (ans < 0) ans = 0;

        System.out.println(ans);
	}
}
