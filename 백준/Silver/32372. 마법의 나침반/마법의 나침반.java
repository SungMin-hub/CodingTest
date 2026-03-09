import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N, M;
    static int[] X, Y, K;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        X = new int[M];
        Y = new int[M];
        K = new int[M];

        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            X[i] = Integer.parseInt(st.nextToken());
            Y[i] = Integer.parseInt(st.nextToken());
            K[i] = Integer.parseInt(st.nextToken());
        }

        for(int tx = 1; tx <= N; tx++){
            for(int ty = 1; ty <= N; ty++){

                boolean ok = true;

                for(int i = 0; i < M; i++){
                    int x = X[i];
                    int y = Y[i];
                    int k = K[i];

                    if(!check(x, y, tx, ty, k)){
                        ok = false;
                        break;
                    }
                }

                if(ok){
                    System.out.println(tx + " " + ty);
                    return;
                }
            }
        }
    }

    static boolean check(int x, int y, int tx, int ty, int k){

        switch(k){
            case 1: return tx < x && ty == y;
            case 2: return tx < x && ty > y;
            case 3: return tx == x && ty > y;
            case 4: return tx > x && ty > y;
            case 5: return tx > x && ty == y;
            case 6: return tx > x && ty < y;
            case 7: return tx == x && ty < y;
            case 8: return tx < x && ty < y;
        }

        return false;
    }
}
