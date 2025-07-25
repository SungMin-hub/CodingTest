import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String input = br.readLine();

		int sum = 0;

		StringBuilder s = new StringBuilder();
		boolean visited = false;
		for(int i=0; i<input.length(); i++) {
			char c = input.charAt(i);
			if(c =='+') {
				if(visited) {
					sum -= Integer.parseInt(s.toString());
					s = new StringBuilder();
					continue;
				}
				sum += Integer.parseInt(s.toString());
				s = new StringBuilder();
				continue;
			} else if(c =='-') {
				if(visited) {
					sum -= Integer.parseInt(s.toString());
				} else {
					sum += Integer.parseInt(s.toString());
				}
				visited = true;
				s = new StringBuilder();
				continue;
			}
			s.append(c);
		}
		if(visited) {
			sum -= Integer.parseInt(s.toString());
		} else {
			sum += Integer.parseInt(s.toString());
		}
		System.out.println(sum);
	}
}