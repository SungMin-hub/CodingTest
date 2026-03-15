import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static long[] tree;
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        int Q = Integer.parseInt(st.nextToken());

        tree = new long[N + 1];

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < Q; i++) {
            st = new StringTokenizer(br.readLine());
            int type = Integer.parseInt(st.nextToken());

            if (type == 1) {
                int p = Integer.parseInt(st.nextToken());
                long x = Long.parseLong(st.nextToken());
                update(p, x);
            }
            else {
                int p = Integer.parseInt(st.nextToken());
                int q = Integer.parseInt(st.nextToken());
                sb.append(rangeSum(p, q)).append("\n");
            }
        }

        System.out.print(sb);
    }
    static void update(int i, long diff) {
        while (i <= N) {
            tree[i] += diff;
            i += (i & -i);
        }
    }

    static long prefixSum(int i) {
        long sum = 0;
        while (i > 0) {
            sum += tree[i];
            i -= (i & -i);
        }
        return sum;
    }

    static long rangeSum(int l, int r) {
        return prefixSum(r) - prefixSum(l - 1);
    }
}
