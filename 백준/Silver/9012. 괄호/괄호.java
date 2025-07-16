import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();

		for(int i=0; i<T; i++) {
			sb.append(isVPS(br.readLine()) ? "YES" : "NO").append("\n");
		}
		System.out.println(sb);

	}
	private static boolean isVPS(String s){
		int cnt = 0;

		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) == '(') cnt++;
			else if(s.charAt(i) == ')') {
				cnt--;
				if(cnt < 0) return false;
			}
		}
		return cnt == 0;
	}
}