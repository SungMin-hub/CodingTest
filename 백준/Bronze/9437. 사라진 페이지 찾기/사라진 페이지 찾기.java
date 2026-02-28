import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());

            if (N == 0) break;

            int P = Integer.parseInt(st.nextToken());

            int block = (P - 1) / 2;

            int left1 = block * 2 + 1;
            int left2 = block * 2 + 2;

            int right1 = N - left1 + 1;
            int right2 = N - left2 + 1;

            int[] pages = {left1, left2, right1, right2};
            Arrays.sort(pages);

            for (int page : pages) {
                if (page != P) {
                    System.out.print(page + " ");
                }
            }
            System.out.println();
        }
	}
}
