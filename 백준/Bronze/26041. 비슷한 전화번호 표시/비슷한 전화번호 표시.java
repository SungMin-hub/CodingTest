import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = br.readLine().split(" ");
        String B = br.readLine();

        int cnt = 0;

        for (String num : arr) {
            if (!num.equals(B) && num.startsWith(B)) {
                cnt++;
            }
        }

        System.out.println(cnt);
	}
}
