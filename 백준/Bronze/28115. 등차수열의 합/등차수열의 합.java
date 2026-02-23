import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        long[] A = new long[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            A[i] = Long.parseLong(st.nextToken());
        }

        if (N <= 2) {
            System.out.println("YES");
            for(int i = 0; i < N; i++) {
                System.out.print("0 ");
            }
            System.out.println();
            for(int i = 0; i < N; i++) {
                System.out.print(A[i] + " ");
            }
            return;
        }

        long diff = A[1] - A[0];
        boolean isTrue = true;

        for(int i = 2; i < N; i++) {
            if(A[i] - A[i-1] != diff) {
                isTrue = false;
                break;
            }
        }

        if(!isTrue) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
            for(int i = 0; i < N; i++) {
                System.out.print("0 ");
            }
            System.out.println();
            for(int i = 0; i < N; i++) {
                System.out.print(A[i] + " ");
            }
        }
	}
}
