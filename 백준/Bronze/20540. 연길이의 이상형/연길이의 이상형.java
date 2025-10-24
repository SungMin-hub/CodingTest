import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		StringBuilder sb = new StringBuilder();

		for (char c : s.toCharArray()) {
			switch (c) {
				case 'E': sb.append('I'); break;
				case 'I': sb.append('E'); break;
				case 'S': sb.append('N'); break;
				case 'N': sb.append('S'); break;
				case 'T': sb.append('F'); break;
				case 'F': sb.append('T'); break;
				case 'J': sb.append('P'); break;
				case 'P': sb.append('J'); break;
			}
		}

		System.out.println(sb);
	}
}