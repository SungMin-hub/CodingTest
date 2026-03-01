import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String W = br.readLine();
        String S = br.readLine();

        boolean[] used = new boolean[26];
        StringBuilder key = new StringBuilder();

        for (int i = 0; i < W.length(); i++) {
            char c = W.charAt(i);
            if (!used[c - 'A']) {
                used[c - 'A'] = true;
                key.append(c);
            }
        }

        for (char c = 'A'; c <= 'Z'; c++) {
            if (!used[c - 'A']) {
                key.append(c);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < S.length(); i++) {
            char plain = S.charAt(i);
            sb.append(key.charAt(plain - 'A'));
        }

        System.out.println(sb);
	}
}
