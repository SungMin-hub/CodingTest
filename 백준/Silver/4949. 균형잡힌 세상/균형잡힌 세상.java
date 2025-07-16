import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		while (true) {
			String s = br.readLine();
			if(s.equals(".")) break;

			sb.append(right(s) ? "yes" : "no").append("\n");
		}
		System.out.println(sb);
	}
	private static boolean right(String s){
		char[] opened = new char[s.length()];
		int idx = 0;
		int cnt1 = 0, cnt2 = 0;

		for(int i=0; i<s.length(); i++){
			char c = s.charAt(i);
			if(c == '(') {
				cnt1++;
				opened[idx++] = c;
			}
			else if(c == ')') {
				cnt1--;
				if(cnt1 < 0 || idx == 0 || opened[idx - 1] != '(') return false;
				idx--;
			}
			else if(c == '[') {
				cnt2++;
				opened[idx++] = c;
			}
			else if(c == ']') {
				cnt2--;
				if(cnt2 < 0 || idx == 0 || opened[idx - 1] != '[') return false;
				idx--;
			}
		}
		return cnt1 == 0 && cnt2 == 0 && idx == 0;
	}
}