import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();

		int[] cnt = new int[10];

		for(char c : s.toCharArray()) {
			cnt[c - '0']++;
		}

		int num = (cnt[6] + cnt[9] + 1) / 2;
		cnt[6] = num;
		cnt[9] = num;

		int max = 0;
		for(int i=0; i<10; i++) {
			if(cnt[i] > max) {
				max = cnt[i];
			}
		}

		System.out.println(max);
	}
}