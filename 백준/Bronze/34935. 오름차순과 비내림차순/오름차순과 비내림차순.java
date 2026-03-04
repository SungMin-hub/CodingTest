import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        if (N == 1) {
            System.out.println(1);
            return;
        }

        StringTokenizer st = new StringTokenizer(br.readLine());

        long prev = Long.parseLong(st.nextToken());

        for (int i = 1; i < N; i++) {
            long current = Long.parseLong(st.nextToken());

            if (prev >= current) {
                System.out.println(0);
                return;
            }

            prev = current;
        }

        System.out.println(1);
	}
}
