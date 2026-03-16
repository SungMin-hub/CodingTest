import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String[][] arr = new String[n][2];

        int max_birth = Integer.MIN_VALUE;
        int min_birth = Integer.MAX_VALUE;

        int min = 0;
        int max = 0;

        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = st.nextToken();
            String d = st.nextToken();
            if(d.length() == 1) d = "0" + d;
            String m = st.nextToken();
            if(m.length() == 1) m = "0" + m;
            String y = st.nextToken();

            int birth = Integer.parseInt(y + m + d);

            min_birth = Math.min(min_birth,birth);
            if(min_birth == birth) min = i;
            max_birth = Math.max(max_birth,birth);
            if(max_birth == birth) max = i;
        }

        System.out.println(arr[max][0]);
        System.out.println(arr[min][0]);
    }

}
