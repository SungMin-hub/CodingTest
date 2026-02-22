import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            long ans = 0;

            for (int b = 2; b <= N; b++) {
                int temp = N;

                while (temp % b == 0) {
                    ans++;
                    temp /= b;
                }
            }

            sb.append(ans).append("\n");
        }

        System.out.print(sb);
	}
}
