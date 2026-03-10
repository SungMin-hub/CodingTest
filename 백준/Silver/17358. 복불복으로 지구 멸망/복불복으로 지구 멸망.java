import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static final long MOD = 1000000007;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        long ans = 1;

        for(int i = N - 1; i >= 1; i -= 2) {
            ans = (ans * i) % MOD;
        }

        System.out.println(ans);
    }
}
