import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int max = 0;

        for (int i = 1; i <= K; i++) {
            int value = N * i;

            String reversed = new StringBuilder(String.valueOf(value))
                                    .reverse()
                                    .toString();

            int reversedNum = Integer.parseInt(reversed);
            max = Math.max(max, reversedNum);
        }

        System.out.println(max);
    }
}
