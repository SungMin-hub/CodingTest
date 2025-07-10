import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String input = br.readLine();
		int sum = 0;
		int idx = 0;

		for(int i=0; i<input.length(); i += 2) {
			if(input.charAt(i) == '*') {
				idx = i;
				continue;
			}
			sum += (input.charAt(i)-'0');
		}
		for(int i=1; i<input.length(); i += 2) {
			if(input.charAt(i) == '*') {
				idx = i;
				continue;
			}
			sum += (input.charAt(i)-'0')*3;
		}
		if (idx % 2 == 0) {
			System.out.println((10 - sum % 10) % 10);
		} else {
			System.out.println((10 - sum % 10) * 7 % 10);
		}
	}
}