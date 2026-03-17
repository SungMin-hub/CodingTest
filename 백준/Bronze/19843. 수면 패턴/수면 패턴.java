import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    static Map<String, Integer> map = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int T = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        map.put("Mon", 0);
        map.put("Tue", 1);
        map.put("Wed", 2);
        map.put("Thu", 3);
        map.put("Fri", 4);

        int totalSleep = 0;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            String d1 = st.nextToken();
            int h1 = Integer.parseInt(st.nextToken());
            String d2 = st.nextToken();
            int h2 = Integer.parseInt(st.nextToken());

            int start = map.get(d1) * 24 + h1;
            int end = map.get(d2) * 24 + h2;

            totalSleep += (end - start);
        }

        int need = T - totalSleep;

        if (need <= 0) {
            System.out.println(0);
        } else if (need <= 48) {
            System.out.println(need);
        } else {
            System.out.println(-1);
        }
    }
}
